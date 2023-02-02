
package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


/*出勤報告コントローラー*/
@Controller

public class AttendanceController{
 
 
//(マイページから出勤報告画面を表示）
  @GetMapping("/attendance")//出勤報告画面を表示する
     public String attendance (Model model){
         return "attendance"; //attendance.htmlに画面遷移
     }
  
  
//戻るボタン押下→マイページ画面に遷移する
  @GetMapping("/backtoMypage")
     public String back (Model model) {
         return "Mypage"; //Mypage.htmlに画面遷移
     }

//登録ボタンを押下→マイページ画面に遷移する ??
  @PostMapping("registertoMypage")
    public String toMypage(Model model) {
         return "attendance"; //attendance.htmlに画面遷移
     }
 }

//＠GetMappinrg…登録されているデータを取得する
//＠PostMapping…新しいデータを登録する