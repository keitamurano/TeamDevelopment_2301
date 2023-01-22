/**package com.example.demo.controller;


import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.service.PaidService;
/**
 * ユーザー情報 Controller
 */
/**@Controller
public class PaidController {
  private static final Object PaidListParam = null;
/**
   * ユーザー情報 Service
   */
 /** @Autowired
  private PaidService paidService;
  /**
   * 有休一覧画面を表示
   * @param model Model
   * @return 有休一覧画面
   */
 /** @GetMapping(value = "/paid/list")
  public String displayPaidList(Model model) {
    List Paidlist = paidService.searchAll();
    model.addAttribute("PaidListParam", PaidListParam);
    return "paid/list";
  }
  
   @PostMapping("/back")
   public String back () {
	return "Mypage";
   }



}*/
