
package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.form.AttendanceForm;
import com.example.demo.service.AttendanceService;




//出勤報告コントローラー*
@Controller
public class AttendanceController{


	@Autowired
	private AttendanceService attendanceService;
	
//private AttendanceService  attendanceService = new AttendanceService();
//(マイページから出勤報告画面を表示）
  @GetMapping("/attendances")//出勤報告画面を表示する
     public String attendance (Model model){
	  model.addAttribute("AttendanceForm",new AttendanceForm());

         return "attendance"; //attendance.htmlに画面遷移
     }

  
////戻るボタン押下→マイページ画面に遷移する
// @GetMapping("/Mypage")
//     public String back (Model model) {
//         return "Mypage"; //Mypage.htmlに画面遷移
 //    }

  //登録ボタンを押したときに登録をする
  @PostMapping("/attendance")
  public String create(@Validated @ModelAttribute AttendanceForm attendanceForm, BindingResult bindingResult,Model model) {
	  if (bindingResult.hasErrors()) {
	      List<String> errorList = new ArrayList<String>();      
	      for (ObjectError error : bindingResult.getAllErrors()) {
	    	  errorList.add(error.getDefaultMessage());
	      }
	      model.addAttribute("attendanceForm", attendanceForm);
	      model.addAttribute("validationError", errorList);
	      model.addAttribute("AttendanceForm",new AttendanceForm());
//			プルダウンの値を保持する
//	      List<Prefectures> prefecturesList = attendanceService.findAll2();
//			model.addAttribute("prefecturesList", prefecturesList);
  	return "/attendance"; //エラーが出たときの画面の遷移先
		}
	  
	 // ユーザー情報の登録  
	    attendanceService.insert(attendanceForm);
	    model.addAttribute("AttendanceForm", attendanceForm);
	    return "Mypage";
	  }

  }


//＠GetMappinrg…登録されているデータを取得する
//＠PostMapping…新しいデータを登録する

//登録するif文が無いがな（String createで作る）