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

import com.example.demo.entity.ExpencesEntity;
import com.example.demo.entity.Prefectures;
import com.example.demo.form.ExpencesForm;
import com.example.demo.service.ExpencesService;

@Controller
public class ExpencesController {
	/**
	 * ユーザー情報 Service
	 */
	@Autowired
	ExpencesService expencesService;

	//		   * 経費一覧画面を表示
	//		   * @param model Model
	//		   * @return 経費一覧画面
	//	  「http://localhost:8080/expenceslist」にアクセスがあったときのメソッド。
	//		  経費情報をデータベースから取得して、画面に表示する。
	@GetMapping("/expenceslist")
	public String expencesList( Model model) {
		// serviceを使って、申請の一覧をDBから取得する
		List<ExpencesEntity> expenceslist = expencesService.findAllByOrderByUserIdAsc();
		List<Prefectures> prefectures = expencesService.findAll2();
		// modelに経費の一覧を設定して、画面に渡す
		model.addAttribute("expenceslist", expenceslist);
		model.addAttribute("prefecturesList", prefectures);
		return "/expenceslist";
	}

	//経費申請画面で空のフォームを用意する(ここでプルダウンの値が渡されている)
	//	  経費申請画面を表示
	@GetMapping("/expences")
	public String top( Model model) {
		List<Prefectures> prefecturesList = expencesService.findAll2();
		model.addAttribute("expencesForm",new ExpencesForm());
		model.addAttribute("prefecturesList", prefecturesList);
		return "/expences";
	}

	/**
	 * ユーザー新規登録
	 * @param userRequest リクエストデータ
	 * @param model Model
	 * @return ユーザー情報一覧画面
	 */
	@PostMapping("/expences")
	public String expencesInsert(@Validated @ModelAttribute ExpencesForm expencesForm,BindingResult bindingResult,Model model) {
		if (bindingResult.hasErrors()) {
			List<String> errorList = new ArrayList<String>();
			for (ObjectError error : bindingResult.getAllErrors()) {
				errorList.add(error.getDefaultMessage());
			}
			model.addAttribute("expencesForm",expencesForm);
			model.addAttribute("validationError", errorList);
			//	    			プルダウンの値を保持する
			List<Prefectures> prefecturesList = expencesService.findAll2();
			model.addAttribute("prefecturesList", prefecturesList);
			return "/expences";
		}
		//		        // 経費申請の登録
		expencesService.insert(expencesForm);
		//		     // 経費一覧画面にリダイレクト
		return "redirect:/expenceslist";
	}
}

