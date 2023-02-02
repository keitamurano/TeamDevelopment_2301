package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class LeavingworkController{

	 
	//(マイページから出勤報告画面を表示）
	  @GetMapping("/leavingwork")//出勤報告画面を表示する
	     public String leavingwork (Model model){
	         return "leavingwork"; //leaving.htmlに画面遷移
	     }
	  
  
	//戻るボタン押下→マイページ画面に遷移する
	  @GetMapping("/lbacktoMypage")
	     public String back (Model model) {
	         return "lMypage"; //Mypage.htmlに画面遷移
	     }

	//登録ボタンを押下→マイページ画面に遷移する ??
	  @PostMapping("lregistertoMypage")
	    public String toMypage(Model model) {
	         return "leaving"; //attendance.htmlに画面遷移
	     }

}

