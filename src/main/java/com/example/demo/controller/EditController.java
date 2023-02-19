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
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.entity.UserEntity;
import com.example.demo.form.UserRequestForm;
import com.example.demo.service.EditService;

@Controller

public class EditController {
	@Autowired
	EditService editService;
	

	/**
	 * ユーザー情報詳細画面を表示
	 * @param id 表示するユーザーID
	 * @param model Model
	 * @return ユーザー情報詳細画面
	 */
	@GetMapping("/user/edit/{user_id}")
	public String displayAdd(@PathVariable Long user_id, Model model) {
		UserEntity user = editService.findById(user_id);
		UserRequestForm userRequest = new UserRequestForm();
		userRequest.setUser_id(user.getUser_id());
		userRequest.setName(user.getName());
		userRequest.setName_kana(user.getName_kana());
		userRequest.setMail_address(user.getMail_address());
		userRequest.setPassword(user.getPassword());

		model.addAttribute("userRequest", userRequest);
		return "/edit";
	}
	
	
	  /**
	   * ユーザー情報削除
	   * @param id 表示するユーザーID
	   * @param model Model
	   * @return ユーザー情報詳細画面
	   */
	  @GetMapping("/user/edit/delete/{user_id}")
	  public String delete(@PathVariable Long user_id, Model model) {
	    // ユーザー情報の削除
		editService.delete(user_id);
	    return "/Mypage";
	  }
	 
	  

	  
//	  @DeleteMapping("/user/edit/delete/{user_id}")
//		public String delete(@PathVariable Long user_id) {
//		    // ユーザー情報の削除
//		    editService.delete(user_id);
//		    return "redirect:/login";
//		}
	
	  
	 /**
	   * ユーザー更新（編集)
	   * @param userRequest リクエストデータ
	   * @param model Model
	   * @return ユーザー情報詳細画面
	   */
	  @RequestMapping(value = "/user/update", method = RequestMethod.POST)
	  public String update(@Validated @ModelAttribute UserRequestForm userRequest, BindingResult result, Model model) {
	    if (result.hasErrors()) {
	      List<String> errorList = new ArrayList<String>();
	      for (ObjectError error : result.getAllErrors()) {
	        errorList.add(error.getDefaultMessage());
	      }
	      model.addAttribute("userRequest", userRequest);
	      model.addAttribute("validationError", errorList);
	      return "/edit";
	    }
	    // ユーザー情報の更新
	    editService.update(userRequest);
	    return "/Mypage";
	  }
}

