package com.example.demo.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MypageController {

	@GetMapping(value ="/mypage")
	public String mypage(Model model) {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		//Principalからログインユーザの情報を取得
		String userName = auth.getName();
		model.addAttribute("user", userName);
		return "Mypage";
	}

	@PostMapping("/attendanc")
	public String postAttendance(Model model) {
		return "attendance";
	}

	@GetMapping("/kintaiichiran")
	public String postCreate(Model model) {
		return "kintaiichiran";
	}
	@GetMapping("/edit")
	public String postCreate2(Model model) {
		return "edit";
	}
	@PostMapping("/top")
	public String postExpences(Model model) {
		return "expences";
	}
	@PostMapping("/top2")
	public String postExpanceslist(Model model) {
		return "expenceslist";
	}
	@PostMapping("/paid/list")
	public String postPaidlist(Model model) {
		return "Paid";
	}
}

