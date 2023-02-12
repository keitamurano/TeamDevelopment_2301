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
	//
	//	    @RequestMapping("/edit")
	//	    public String user() {
	////	        String username = httpServletRequest.getRemoteUser();
	//////	        User user = userRepository.getOne(username);
	//////	        modelMap.addAttribute("user", user);
	//	        return "/Edit";
	//	    }
	/**
	 * ユーザー新規登録画面を表示
	 * @param model Model
	 * @return ユーザー情報一覧画面
	 */
	//	  @GetMapping(value = "/user/edit")
	//	  public String displayAdd(Model model) {
	//	    return "edit";
	//	  }

	/**
	 * ユーザー情報詳細画面を表示
	 * @param id 表示するユーザーID
	 * @param model Model
	 * @return ユーザー情報詳細画面
	 */
	@GetMapping("/user/edit")
	public String displayAdd(@PathVariable Long id, Model model) {
		UserEntity user = editService.findById(id);
		UserRequestForm userRequest = new UserRequestForm();
		userRequest.setUser_id(user.getUser_id());
		userRequest.setName(user.getName());
		userRequest.setName_kana(user.getName_kana());
		userRequest.setMail_address(user.getMail_address());
		userRequest.setPassword(user.getPassword());

		model.addAttribute("UserRequest", userRequest);
		return "/edit";
	}

	@RequestMapping(value = "/user/edit", method = RequestMethod.POST)
	public String edit(@Validated @ModelAttribute UserRequestForm userRequest, BindingResult result, Model model) {
		if (result.hasErrors()) {

			// 入力チェックエラーの場合
			List<String> errorList = new ArrayList<String>();
			for (ObjectError error : result.getAllErrors()) {
				errorList.add(error.getDefaultMessage());
			}
			model.addAttribute("validationError", errorList);
			return "edit";
		}
		// ユーザー情報の登録
		editService.update(userRequest);
		model.addAttribute("userRequest",userRequest);
		return "/Mypage";
	}

}

