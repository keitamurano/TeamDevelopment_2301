//package com.example.demo.controller;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PostMapping;
//
//@Controller
//public class ExpencesControoller {
//
//
//	//トップページ（経費申請画面）を表示
//   //経費申請のボタンのformから
//	@GetMapping("/top")
//	public String top(Model model) {
//		return "expences";
//	}
//
//    //	戻るボタンを押すとマイページ画面に遷移
//	@GetMapping("/back")
//	public String back(Model model) {
//		return "Mypage";
//	}
//
//    //	申請ボタンを押すと経費一覧画面に遷移
//	@PostMapping("")
//	public String regist(@ModelAttribute expencesForm expencesForm,
//						Model model) {
//			expencesEntity expencesEntity = expencesEntity.createExpences(expencesForm);
//			model.addAttribute("expencesEntity", expencesEntity);
//			return "expenceslist";
//		}
//
//}
