package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.ExpencesEntity;
import com.example.demo.entity.Prefectures;
import com.example.demo.form.ExpencesForm;
import com.example.demo.repository.ExpencesRepository;
import com.example.demo.repository.PrefecturesRepository;

@Service
@Transactional
public class ExpencesService {
	@Autowired
	ExpencesRepository expencesRepository;

	@Autowired
	PrefecturesRepository prefecturesRepository;

	//  DBから全件取得
	public List<Prefectures> findAll2() {
		return prefecturesRepository.findAll();
	}

	public List<ExpencesEntity> findAllByOrderByUserIdAsc() {
		return expencesRepository.findAllByOrderByUserIdAsc();
	}

	/**
	 * 経費申請新規登録
	 * @param user ユーザー情報
	 */
	public void insert(ExpencesForm expencesForm) {
		ExpencesEntity expencesEntity = new ExpencesEntity();
		expencesEntity.setUserId(expencesForm.getUserId());
		expencesEntity.setApplicationDate(expencesForm.getApplicationDate());
		expencesEntity.setExpencesItem(expencesForm.getExpencesItem());
		expencesEntity.setAmountMoney(expencesForm.getAmountMoney());
		expencesEntity.setRemarks(expencesForm.getRemarks());
		// データベースに登録する
		expencesRepository.save(expencesEntity);
	}
}
