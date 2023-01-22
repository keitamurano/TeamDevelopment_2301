
package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller

public class PaidController {
	

	  /**
	   * 有給一覧画面を表示
	   * @param model Model
	   * @return 有給一覧画面
	   */
	  @GetMapping(value = "/paid/list")
	  public String displayPaidList(Model model) {
	    return "Paid";
	  }
	  
	  @PostMapping("/back") 
	  public String back() {
		  return "Mypage";
	  }
	  
	  
}