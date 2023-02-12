
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
	  public String mypage(/**@RequestParam String name, String userID, **/Model model) {
//		// model.addAllAttributes("name",name,"userID",userID);
//		MypageEntity user = mypageService.findById(1);
//	    model.addAttribute("user", user);
//	    return "Mypage";

		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		//Principalからログインユーザの情報を取得
		String userName = auth.getName();
		model.addAttribute("user", userName);
		return "Mypage";
	  }
	 
		 
	  @PostMapping("/edit")
	  public String postEdit(/**@RequestParam String name, String userID, **/Model model) {
		// model.addAllAttributes("name",name,"userID",userID);
		  return "edit";
	  }
	  
	  @PostMapping("/attendance"/**path="/mypage", params = "attendance-button"**/)
	  public String postAttendance(/**@RequestParam String name, String userID, **/Model model) {
		// model.addAllAttributes("name",name,"userID",userID);
		  return "attendance";
	  }
	  
	  @PostMapping("/leavingwork"/**path="/mypage", params = "leavingwork-button"**/)
	  public String postLeavingwork(/**@RequestParam String name, String userID, **/Model model) {
		// model.addAllAttributes("name",name,"userID",userID);
		  return "leavingwork";
	  }
	  
	  @GetMapping("/kintaiichiran" /** path="/mypage", params = "create-button"**/)
	  public String postCreate(/**@RequestParam String name, String userID, **/Model model) {
		// model.addAllAttributes("name",name,"userID",userID);
		  return "kintaiichiran";
	  }
	  
	  @GetMapping("/edit" /**path="/mypage", params = "create2-button"**/)
	  public String postCreate2(/**@RequestParam String name, String userID, **/Model model) {
		// model.addAllAttributes("name",name,"userID",userID);
		  return "edit";
	  }
	  
	  @PostMapping("/top" /**path="/mypage", params = "expences-button"**/)
	  public String postExpences(/**@RequestParam String name, String userID, **/Model model) {
		// model.addAllAttributes("name",name,"userID",userID);
		  return "expences";
	  }
	  
	  @PostMapping("/top2" /**path="/mypage", params = "expanceslist-button"**/)
	  public String postExpanceslist(/**@RequestParam String name, String userID, **/Model model) {
		// model.addAllAttributes("name",name,"userID",userID);
		  return "expenceslist";
	  }
	  
	  @PostMapping("/paid/list" /**path="/mypage", params = "paidlist-button"**/)
	  public String postPaidlist(/**@RequestParam String userID, **/Model model) {
		// model.addAllAttributes("name",name,"userID",userID);
		  return "Paid";
	  }
	
}



/**

@Controller

public class MypageController {

	
	 @GetMapping(value ="/mypage")
	  public String mypage(Model model) {

	    return "Mypage";
	  } 
		 
	  @PostMapping(path="/mypage", params = "editbutton")
	  public String postEdit() {
		  return "edit";
	  }
	  
	  @PostMapping(path="/mypage", params = "attendance-button")
	  public String postAttendance() {
		  return "attendance";
	  }
	  
	  @PostMapping(path="/mypage", params = "leavingwork-button")
	  public String postLeavingwork() {
		  return "leavingwork";
	  }
	  
	  @PostMapping(path="/mypage", params = "create-button")
	  public String postCreate() {
		  return "create";
	  }
	  
	  @PostMapping(path="/mypage", params = "create2-button")
	  public String postCreate2() {
		  return "create2";
	  }
	  
	  @PostMapping(path="/mypage", params = "expences-button")
	  public String postExpences() {
		  return "expences";
	  }
	  
	  @PostMapping(path="/mypage", params = "expanceslist-button")
	  public String postExpanceslist() {
		  return "expenceslist";
	  }
	  
	  @PostMapping(path="/mypage", params = "paidlist-button")
	  public String postPaidlist() {
		  return "Paid";
	  }
	
}

**/

