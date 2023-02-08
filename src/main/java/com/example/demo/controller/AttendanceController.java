
package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.form.AttendanceForm;
import com.example.demo.service.AttendanceService;


/*出勤報告コントローラー*/
@Controller
public class AttendanceController{
 
private AttendanceService  attendanceService = new AttendanceService();
//(マイページから出勤報告画面を表示）
  @GetMapping("/attendance")//出勤報告画面を表示する
     public String attendance (Model model){
	  model.addAttribute("AttendanceForm",new AttendanceForm());

         return "attendance"; //attendance.htmlに画面遷移
     }
  //19-26行目　HTMLの表示
  
//戻るボタン押下→マイページ画面に遷移する
  @GetMapping("/backtoMypage")
     public String back (Model model) {
         return "Mypage"; //Mypage.htmlに画面遷移
     }

  //登録ボタンを押したときに登録をする
  @PostMapping(value = "/Attendance")
  public String create(@ModelAttribute AttendanceForm attendanceForm, Model model) {
	    /*if (result.hasErrors()) {
	      // 入力チェックエラーの場合
	      List<String> errorList = new ArrayList<String>();
	      for (ObjectError error : result.getAllErrors()) {
	        errorList.add(error.getDefaultMessage());
	      }
	      model.addAttribute("validationError", errorList);
	      return "user/add";S
	    }*/
	    // ユーザー情報の登録
	  model.addAttribute("attendanceForm", attendanceForm);
	    attendanceService.insert(attendanceForm);
	    return "redirect:/user/list";
	  }
 }

//＠GetMappinrg…登録されているデータを取得する
//＠PostMapping…新しいデータを登録する

//登録するif文が無いがな（String createで作る）