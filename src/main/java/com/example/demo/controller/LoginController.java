package com.example.demo.controller;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
//@RequestMapping("login1")
public class LoginController {
	
	/**ログイン画面を表示*/
	@GetMapping("/login1")
	public String Login() {
		
	    String password = "123456";
	    PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
	    String hashedPassword = passwordEncoder.encode(password);
	    System.out.println("hasyyuka");
	    System.out.println(hashedPassword);


		return  "/login1";
	}
	
//	@GetMapping("/Mypage1")
//	public String Mypage1() {
//		return "/Mypage1";
//	}
//	
//	@GetMapping("/shinki")
//	public String Shinki() {
//
//		return "/shinki";
//	}
//
//
//	@GetMapping("/edit")//編集
//	public String Edit() {
//
//
//		return "/edit";
//	}
//	
//	
//	@GetMapping("/attendance")//出勤
//	public String Attendance() {
//
//
//		return "/attendance";
//	}
//	
//	@GetMapping("/clock_out")//退勤
//	public String Clock_out() {
//
//
//		return "/clock_out";
//	}
//	
//	@GetMapping("/attendance/attendance_index")//勤怠一覧
//	public String Attendance_index() {
//
//
//		return "/attendance/attendance_index";
//	}
	

}