package com.example.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.service.MypageService;

@Controller

public class MypageController {
	
	
	@Autowired
	  private MypageService mypageService;
	  
	 @GetMapping("/mypage")
	  public String mypage() {
	    return "mypage";
	  } 

	  @PostMapping(path="/mypage", params = "editbutton")
	  public String edit() {
		  
		  return "/edit";
	  }
	  
	  @PostMapping(path="/mypage", params = "attendance-button")
	  public String attendance() {
		  return "/attendance";
	  }
	  
	  @PostMapping(path="/mypage", params = "leavingwork-button")
	  public String leavingwork() {
		  return "/leavingwork";
	  }
	  
	  @PostMapping(path="/mypage", params = "create-button")
	  public String create() {
		  return "/create";
	  }
	  
	  @PostMapping(path="/mypage", params = "create2-button")
	  public String create2() {
		  return "/create2";
	  }
	  
	  @PostMapping(path="/mypage", params = "expences-button")
	  public String Expences() {
		  return "/expences";
	  }
	  
	  @PostMapping(path="/mypage", params = "expanceslist-button")
	  public String expanceslist() {
		  return "/expenceslist";
	  }
	  
	  @GetMapping(path="/mypage", params = "paidlist-button")
	  public String paidlist() {
		  return "/paidlist";
	  }
	
}
