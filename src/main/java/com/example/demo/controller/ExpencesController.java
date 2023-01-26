package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.dto.ExpencesListParam;
import com.example.demo.form.ExpencesForm;
import com.example.demo.service.ExpencesService;

@Controller
public class ExpencesController {



	  /**
	   * ユーザー情報 Service
	   */
	  @Autowired
	  private ExpencesService expencesService;



//	@GetMapping("/expences")
//	public String top(Model model) {
//		model.addAttribute("expences",new ExpencesForm());
//		return "/expences";
//	}

//経費申請画面で空のフォームを用意する
		@GetMapping("/expences")
		public String top(Model model) {
			model.addAttribute("expences",new ExpencesForm());
			return "/expences";
		}


//経費申請画面でのフォーム入力を経費一覧画面に送信する
		  @PostMapping("/expences")
		  public String Submit(@Validated  ExpencesForm expencesForm, BindingResult error,Model model) {
			  model.addAttribute("expences", ExpencesService.create());
		      return "expenceslist";
		  }




//	   ユーザー情報一覧画面を表示
//	    @param model Model
//	    @return ユーザー情報一覧画面
		  @GetMapping("expenceslist")
		  public String displayList(Model model) {
			  ExpencesListParam expencesListParam = expencesService.searchAll();
			  model.addAttribute("expences", expencesListParam);
			  return "expenceslist";
		  }



//	経費申請、経費一覧ともに「戻る」ボタンでマイページ画面に遷移
	@GetMapping("/Mypage")
	public String back() {
		return "/Mypage";
	}




//	@GetMapping("/expenceslist")
//	public String application(Model mode) {
//	    List<ExpencesForm> list = new ArrayList<ExpencesForm>();
//	    list.add(new ExpencesForm());
//		return "/expenceslist";
//	}




//	  @GetMapping(value = "expenceslist")
//	  public String displayList(Model model) {
//		ExpencesListParam expencesListParam = expencesService.searchAll();
//	    model.addAttribute("expences", expencesListParam);
//	    return "expenceslist";
//	  }


//		経費申請画面で「申請」ボタンを押すと経費一覧画面に遷移
	@GetMapping("/confirm")
	public String regist(@ModelAttribute ExpencesForm expencesForm, Model model) {
		//Modelへの追加
		model.addAttribute("expenceslist.", expencesForm);
		return "/expenceslist";
	}


	//	経費一覧画面で「戻る」ボタンを押すとマイページ画面に遷移
	@GetMapping("/mypageBack")
	//	public String back(Model model) {
	public String mypageBack() {
		return "Mypage";
	}

}
