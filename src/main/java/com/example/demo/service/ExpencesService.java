package com.example.demo.service;



import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.ExpencesListParam;
import com.example.demo.entity.ExpencesEntity;
import com.example.demo.entity.Prefectures;
import com.example.demo.form.ExpencesForm;
import com.example.demo.repository.ExpencesRepository;
import com.example.demo.repository.PrefecturesRepository;
/**
 * ユーザー情報 Service
 */
@Service
public class ExpencesService {

  @Autowired
  private ExpencesRepository expencesRepository;

  @Autowired
  private PrefecturesRepository prefecturesRepository;

  public List<Prefectures> getPrefecturesAll() {
	  return prefecturesRepository.findAll();
  }


//  経費申請登録
//@return 検索結果
  public static ExpencesForm create() {

  	  ExpencesForm expencesForm = new ExpencesForm();
  	  expencesForm.getUserId();
  	  expencesForm.getApplicationDate();
  	  expencesForm.getExpencesItem();
  	  expencesForm.getAmountMoney();
  	  expencesForm.getRemarks();

      return expencesForm;
  }

//  経費申請テーブルで値を保持する
  public ExpencesEntity save(ExpencesEntity expencesEntity) {
	  return expencesRepository.save(expencesEntity);
  }









  	  /**
  	   * 経費申請情報 全検索
  	   * @return 検索結果
  	   */
  	  public ExpencesListParam searchAll() {
  	    // 経費申請情報の取得
  	    List<ExpencesEntity> expencesList = expencesRepository.findAll();

  	  ExpencesListParam expencesListParam = new ExpencesListParam();
  	    List<ExpencesForm> list = new ArrayList<ExpencesForm>();

  	    // エンティティを画面データに詰め替える
  	    for(ExpencesEntity expences : expencesList) {
  	    	ExpencesForm data = new ExpencesForm();

  	      data.setUserId(expences.getUserId());
  	      data.setApplicationDate(expences.getApplicationDate());
  	      data.setExpencesItem(expences.getExpencesItem());
  	      data.setAmountMoney(expences.getAmountMoney());
  	      data.setRemarks(expences.getRemarks());
  	      list.add(data);
  	    }
  	  expencesListParam.setUserDataList(list);
  	    return expencesListParam;
  	  }

}


