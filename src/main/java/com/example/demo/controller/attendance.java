package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class attendance{
	
	
//出勤報告画面を表示する(マイページから出勤報告画面を表示）
	 @GetMapping("/Mypage")
	    public String top () {
	        return "attendance";
	    }
	 
	 
//戻るボタン押下→マイページ画面に遷移する
	 @GetMapping("/back")
	    public String back () {
	        return "Mypage";
	    }

//登録ボタンを押下→マイページ画面に遷移する
	 @PostMapping("register")
	   public String regsterm() {
	        return "Mypage";
	    }
	}
	