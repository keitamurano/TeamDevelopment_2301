
package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.entity.LeavingworkEntity;
import com.example.demo.form.LeavingworkForm;

public class LeavingworkService {
	

	//出勤報告のRepositoryS
	@Autowired
	private LeavingworkEntity leavingworkRepository=new LeavingworkEntity();


	//DBから全件取得
	public List<LeavingworkEntity> getLeavingworkAll() {
	   return LeavingworkEntity.findAll();
	}

	//エンティティ（データを格納する箱）を画面データに詰め替える

	public void insert(LeavingworkForm leavingworkForm) {
	LeavingworkEntity leavingworkEntity = new LeavingworkEntity();
	leavingworkEntity.setUserid(leavingworkForm.getUserId());
	leavingworkEntity.setStatus(leavingworkForm.getStatus());
	leavingworkEntity.setEnddate(leavingworkForm.getEnddate());
	leavingworkEntity.setEndtime(leavingworkForm.getEndtime());
	leavingworkEntity.setBreaktime(leavingworkForm.getBreaktime());
	leavingworkEntity.setRemarks(leavingworkForm.getRemarks());

	 leavingworkRepository.save(leavingworkEntity);
	
		// TODO 自動生成されたメソッド・スタブ
		
	}
}