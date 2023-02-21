package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.entity.kintaiEntity;
import com.example.demo.service.kintaiService;

@Controller
public class kintaiichiranController {

	@Autowired
	private kintaiService kintaiservice;

	@GetMapping("mypage/kintaiichiran")
	public String kintaiList(Model model) {
		List<kintaiEntity> kintailist = kintaiservice.searchAll();
		model.addAttribute("kintailist", kintailist);
		
		return "kintaiichiran";
	}

	@GetMapping("/mypages")
	public String myPage() {
		
		return "/Mypage";
	}
}