package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.form.UserRequest;
import com.example.demo.service.NewuserService;

@Controller
public class Newuser {
	  /**
	   * ユーザー情報 Service
	   */
	   @Autowired
	   NewuserService newuserService;

	
//	    @RequestMapping("/user")
//	    public String user() {
//	        return "/Newuser";
//	    }
//	    
	    @GetMapping("/Newuser")
	    public String displayAdd(Model model) {
	        model.addAttribute("userRequest", new UserRequest());
	     return "/Newuser";
	    }
	    
	    @RequestMapping(value = "/user/create", method = RequestMethod.POST)
	    public String create(@Validated @ModelAttribute UserRequest userRequest, BindingResult result, Model model) {
	      if (result.hasErrors()) {
	    	  
	        // 入力チェックエラーの場合
	        List<String> errorList = new ArrayList<String>();
	        for (ObjectError error : result.getAllErrors()) {
	          errorList.add(error.getDefaultMessage());
	        }
	        model.addAttribute("validationError", errorList);
	        return "/Newuser";
	      }
	      // ユーザー情報の登録
	      newuserService.create(userRequest);
	      model.addAttribute("userRequest",userRequest);
	      return "/login";
	    }
	    
	    
	    
	    
	    

	}

	//1行目: 引数にHttpServletRequestを指定することによってそのオブジェクトが取得できる。
	//2行目: getRemoteUserメソッドでユーザ名を取得する。
	//3行目: getOneメソッドは、JpaRepositoryに最初から用意されているメソッドで、IDからインスタンスを取得することができる。
	//4行目: addAttributeメソッドで、userをビューに送る。String以外のオブジェクトでもビューに送ることができる。

