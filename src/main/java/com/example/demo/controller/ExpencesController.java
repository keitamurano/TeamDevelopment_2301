package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.form.ExpencesForm;

@Controller
public class ExpencesController {


	//トップページ（経費申請画面）を表示
   //マイページ画面の「経費申請」ボタンから
	@GetMapping("/top")
//	public String top(Model model) {
	public String top() {
			return "expences";
		}

//    	経費申請画面で「戻る」ボタンを押すとマイページ画面に遷移
	@PostMapping("/back")
//	public String back(Model model) {
	public String back() {
		return "Mypage";
	}

//経費一覧画面でフォームに入力された値を、経費一覧画面に代入し、値を表示させる
	@GetMapping("/regist")
	public String regist(Model model, ExpencesForm expencesForm) {
    //Modelへの追加し、フォームで受け取った値を経費一覧のthymeleaf（expences）に代入
       model.addAttribute("expenceslist",expencesForm);
		   return "expenceslist";
	}




    //	経費一覧画面で「戻る」ボタンを押すとマイページ画面に遷移
	@GetMapping("/mypageBack")
//	public String back(Model model) {
	public String mypageBack() {
		return "Mypage";
	}



}
