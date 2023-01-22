/**package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ExpencesController {


	//トップページ（経費申請画面）を表示
   //マイページ画面の「経費申請」ボタンから
	@GetMapping("/top")
//	public String top(Model model) {
	public String top() {
			return "expences";
		}


    //	経費申請画面で「戻る」ボタンを押すとマイページ画面に遷移
	@GetMapping("/back")
//	public String back(Model model) {
	public String back() {
		return "Mypage";
	}

    //	申請ボタンを押すと経費一覧画面に遷移
//	@PostMapping("/")
//	public String regist(@ModelAttribute ExpencesForm expencesForm,
//						      Model model) {
//			ExpencesForm expencesForm = expencesService.createExpences(expencesForm);
//			model.addAttribute("expencesEntity", expencesEntity);
//			return "expenceslist";
//		}


    //	経費一覧画面で「戻る」ボタンを押すとマイページ画面に遷移
	@GetMapping("/mypageBack")
//	public String back(Model model) {
	public String mypageBack() {
		return "Mypage";
	}



}
**/