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
//
//	@GetMapping("/kintaiichiran/{user_id}/edit")
//	public String kintaiEdit(@PathVariable Integer attendance_id, Model model) {
////		kintaiEntity kintaiedit = kintaiservice.findById();
//		kintaiRequest kintairequest = new kintaiRequest();
//		kintairequest.setUser_id(kintaiedit.getUser_id());
//		kintairequest.setStatus(kintaiedit.getStatus());
//		kintairequest.setStart_date(kintaiedit.getStart_date());
//		kintairequest.setStart_time(kintaiedit.getStart_time());
//		kintairequest.setEnd_date(kintaiedit.getEnd_date());
//		kintairequest.setEnd_time(kintaiedit.getEnd_time());
//		kintairequest.setBreak_time(kintaiedit.getBreak_time());
//		kintairequest.setRemarks(kintaiedit.getRemarks());
//		model.addAttribute("kintairequest", kintairequest);
//		return "kintaiEdit";
//	}
}
