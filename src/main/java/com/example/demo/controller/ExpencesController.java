package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.dto.ExpencesListParam;
import com.example.demo.entity.ExpencesEntity;
import com.example.demo.service.ExpencesService;

@Controller
public class ExpencesController {



	  /**
	   * ユーザー情報 Service
	   */
	  @Autowired
	  private ExpencesService expencesService;

//OK------------------------------------------------------------------------------------------------------------
//経費申請画面で空のフォームを用意する(ここでプルダウンの値が渡されている)
//	  経費申請画面を表示
	  @RequestMapping(value = "/expences", method = RequestMethod.GET)
	  public String top(Model model) {
//			List<Prefectures> prefecturesList = expencesService.getPrefecturesAll();
//			List<ExpencesEntity> expencesEntity = expencesService.getExpencesAll();
		  model.addAttribute("expencesListParam",new ExpencesListParam());
//			model.addAttribute("expencesList", expencesEntity);
//			model.addAttribute("prefecturesList", prefecturesList);
		  return "/expences";
	  }



//OK------------------------------------------------------------------------------------------------------------
//		   * 経費一覧画面を表示
//		   * @param model Model
//		   * @return 経費一覧画面
	    @RequestMapping(value = "/expenceslist", method = RequestMethod.POST)
	  public String displayList(Model model) {
		  List<ExpencesEntity> expenceslist = expencesService.getExpencesAll();
//		    List<Prefectures> prefectures = expencesService.getPrefecturesAll();
		  model.addAttribute("expenceslist", expenceslist);
//		    model.addAttribute("prefecturesList", prefectures);
		  return "/expenceslist";
	  }


		    /**
		     * ユーザー新規登録
		     * @param userRequest リクエストデータ
		     * @param model Model
		     * @return ユーザー情報一覧画面
		     */
		    @RequestMapping(value = "/create", method = RequestMethod.POST)
		    public String create( @ModelAttribute ExpencesListParam expencesListParam, Model model) {
//		    public String create(@ModelAttribute ExpencesForm expencesForm) {
		        // ユーザー情報の登録
		        expencesService.create(expencesListParam);
//		        expencesService.create(expencesForm);
		        return "redirect:/expenceslist";
		    }



//	経費申請、経費一覧ともに「戻る」ボタンでマイページ画面に遷移
	@GetMapping("/Mypage")
	public String back() {
		return "/Mypage";
	}
}