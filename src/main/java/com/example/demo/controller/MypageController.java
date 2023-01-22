
package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller

public class MypageController {

	
	 @GetMapping(value ="/mypage")
	  public String mypage(Model model) {

	    return "Mypage";
	  } 
		 
	  @PostMapping(path="/mypage", params = "editbutton")
	  public String postEdit() {
		  return "/edit";
	  }
	  
	  @PostMapping(path="/mypage", params = "attendance-button")
	  public String postAttendance() {
		  return "/attendance";
	  }
	  
	  @PostMapping(path="/mypage", params = "leavingwork-button")
	  public String postLeavingwork() {
		  return "/leavingwork";
	  }
	  
	  @PostMapping(path="/mypage", params = "create-button")
	  public String postCreate() {
		  return "/create";
	  }
	  
	  @PostMapping(path="/mypage", params = "create2-button")
	  public String postCreate2() {
		  return "/create2";
	  }
	  
	  @PostMapping(path="/mypage", params = "expences-button")
	  public String postExpences() {
		  return "/expences";
	  }
	  
	  @PostMapping(path="/mypage", params = "expanceslist-button")
	  public String postExpanceslist() {
		  return "/expenceslist";
	  }
	  
	  @GetMapping(path="/mypage", params = "paidlist-button")
	  public String postPaidlist() {
		  return "/paidlist";
	  }
	
}

