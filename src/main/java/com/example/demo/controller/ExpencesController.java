package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.example.demo.form.ExpencesForm;

@Controller
public class ExpencesController {

	//トップページ（経費申請画面）を表示
	//マイページ画面の「経費申請」ボタンから
	@GetMapping("/top")
	public String top(Model model) {
		model.addAttribute("expences",new ExpencesForm());
		return "/expences";
	}

//    @RequestMapping("/confirm2")
//    public String output(@ModelAttribute ExpencesForm expencesForm, Model model) {
//        model.addAttribute("demoForm", expencesForm);
//        return "expenceslist";
//    }
	@GetMapping("/Mypage")
	public String back() {
		return "/Mypage";
	}

	@GetMapping("/expenceslist")
	public String application() {
		return "/expenceslist";
	}


	@GetMapping("/top2")
	public String top2() {
		return "/expenceslist";
	}
	//	経費申請画面で「戻る」ボタンを押すとマイページ画面に遷移
	//	@GetMapping("/back")
	//	public String back(Model model) {
	//	public String back() {
	//		return "Mypage";
	//	}


	//経費申請画面「戻る」ボタンを押すとマイページ画面に遷移
//	@RequestMapping(value = "@{/confirm}", params = "back", method = RequestMethod.POST)
//	public String back() {
//		return "/Mypage";
//	}

	//経費一覧画面「戻る」ボタンを押すとマイページ画面に遷移
//	@RequestMapping(value = "@{/confirm2}", params = "back", method = RequestMethod.POST)
//	public String back2() {
//		return "/Mypage";
//	}

	//	経費申請画面で「申請」ボタンを押すと経費一覧画面に遷移
	@GetMapping("/confirm")
	public String regist(@ModelAttribute ExpencesForm expencesForm, Model model) {
		//Modelへの追加
		model.addAttribute("expenceslist.", expencesForm);
		return "/expenceslist";
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
