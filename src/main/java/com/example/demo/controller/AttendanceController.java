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

	//＠GetMappinrg…登録されているデータを取得する
	//(マイページから出勤報告画面を表示)
	//出勤報告画面を表示する
	@GetMapping("/attendances")
	public String attendance (Model model){
		model.addAttribute("AttendanceForm",new AttendanceForm());

		//attendance.htmlに画面遷移
		return "attendance"; 
	}

	//＠PostMapping…新しいデータを登録する
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

			//エラーが出たときの画面の遷移先
			return "/attendance";
		}

		// ユーザー情報の登録  
		attendanceService.insert(attendanceForm);
		model.addAttribute("AttendanceForm", attendanceForm);
		return "Mypage";
	}
}