package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entity.ExpencesEntity;
import com.example.demo.form.ExpencesForm;
import com.example.demo.service.ExpencesService;

@Controller
public class ExpencesController {



	  /**
	   * ユーザー情報 Service
	   */
	  @Autowired
	  private ExpencesService expencesService;

//OK------------------------------------------------------------------------------------------------------------
//		   * 経費一覧画面を表示
//		   * @param model Model
//		   * @return 経費一覧画面
//	    @RequestMapping(value = "/expenceslist", method = RequestMethod.GET)
	  @GetMapping("/expenceslist")
//	  @PostMapping("/expenceslist")
	  public String displayList(Model model) {
		// serviceを使って、申請の一覧をDBから取得する
		  List<ExpencesEntity> expenceslist = expencesService.getExpencesAll();
//		    List<Prefectures> prefectures = expencesService.getPrefecturesAll();
		// modelに経費の一覧を設定して、画面に渡す
		  model.addAttribute("expenceslist", expenceslist);
//		    model.addAttribute("prefecturesList", prefectures);
		  return "/expenceslist";
	  }

//OK------------------------------------------------------------------------------------------------------------
//経費申請画面で空のフォームを用意する(ここでプルダウンの値が渡されている)
//	  経費申請画面を表示
//	  @RequestMapping(value = "/expences", method = RequestMethod.GET)
	  @GetMapping("/expences")
//	  @PostMapping("/expences")
	  public String top(Model model) {
//			List<Prefectures> prefecturesList = expencesService.getPrefecturesAll();
//			List<ExpencesEntity> expencesEntity = expencesService.getExpencesAll();
		  model.addAttribute("expencesForm",new ExpencesForm());
//			model.addAttribute("expencesList", expencesEntity);
//			model.addAttribute("prefecturesList", prefecturesList);
		  return "/expences";
	  }






		    /**
		     * ユーザー新規登録
		     * @param userRequest リクエストデータ
		     * @param model Model
		     * @return ユーザー情報一覧画面
		     */
//		    @RequestMapping(value = "/expenceslist", method = RequestMethod.POST)
	        @PostMapping("/expences")
//	        @GetMapping("/expences")
		    public String create( @ModelAttribute ExpencesForm expencesForm, Model model) {
		        // 経費申請の登録
		        expencesService.insert(expencesForm);
//		        expencesService.create(expencesForm);
		     // 経費一覧画面にリダイレクト
		        return "redirect:/expenceslist";
		    }



//	経費申請、経費一覧ともに「戻る」ボタンでマイページ画面に遷移
	@GetMapping("/Mypage")
	public String back() {
		return "/Mypage";
	}
}