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
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.form.UserRequestForm;
import com.example.demo.service.NewuserService;

@Controller
public class NewuserController {

	/**
	 * ユーザー情報 Service
	 */
	@Autowired
	NewuserService newuserService;

	@GetMapping("/Newuser")
	public String displayAdd(Model model) {
		model.addAttribute("userRequestForm", new UserRequestForm());
		return "/Newuser";
	}

	@PostMapping("/user/create")
	public String create(@Validated @ModelAttribute UserRequestForm userRequestForm, BindingResult result, Model model) {
		if (result.hasErrors()) {

			// 入力チェックエラーの場合
			List<String> errorList = new ArrayList<String>();
			for (ObjectError error : result.getAllErrors()) {
				errorList.add(error.getDefaultMessage());
			}
			model.addAttribute("userRequestForm",userRequestForm);
			model.addAttribute("validationError", errorList);
			return "/Newuser";
		}
		// ユーザー情報の登録
		newuserService.create(userRequestForm);
		return "/Mypage";
	}
}
