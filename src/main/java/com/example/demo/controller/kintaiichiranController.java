package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.repository.attendanceRepository;
import com.example.demo.service.kintaiService;


@Controller
public class kintaiichiranController {

	@Autowired
	private kintaiService kintaiservice;

	/**
	 * ユーザー情報一覧画面を表示
	 * 
	 * @param model Model
	 * @return ユーザー情報一覧画面
	 */
	@GetMapping("mypage/kintaiichiran")
	public String kintaiList(Model model) {
		List<attendanceRepository> kintailist = kintaiservice.searchAll();
		model.addAttribute("kintailist", kintailist);
		return "user/list";
	}

	@GetMapping("/mypages")
	public String myPage() {
		return "/Mypage";
	}

	@PostMapping("/kintaiedit")
	public String kintaiEdit(Model model) {
//		 model.addAllAttributes("kintaiedit", kintaiEdit);
		return "/kintaiEdit";
	}
}
