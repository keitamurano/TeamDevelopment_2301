package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entity.PaidEntity;
import com.example.demo.service.PaidService;

@Controller
public class PaidController {
	@Autowired
	private PaidService paidService;
	/**
	 * 有給一覧画面を表示
	 * @param model Model
	 * @return 有給一覧画面
	 */
	/**
	  @GetMapping(value = "/paid/list")
	  public String displayPaidList(Model model) {
		    Optional<PaidEntity> paidList  = paidService.selectById(1);
		  model.addAttribute("paidList", paidList);
	    return "Paid";
	  }
	 **/
	@GetMapping(value = "/paid/list") 
	public String PaidList(Model model){

		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		//Principalからログインユーザの情報を取得
		String userID = auth.getName();
		model.addAttribute("user", userID);
		PaidEntity paidlist = paidService.findById(1);
		model.addAttribute("paidlist", paidlist);
		return "Paid";
	}
	@PostMapping("/mypage") 
	public String back() {
		return "Mypage";
	}
}