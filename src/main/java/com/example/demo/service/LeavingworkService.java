

package com.example.demo.service;

import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.LeavingworkEntity;
import com.example.demo.form.LeavingworkForm;
import com.example.demo.repository.LeavingworkRepository;

@Service
public class LeavingworkService {
	
//出勤報告のRepositoryS
	@Autowired
	 LeavingworkRepository leavingworkRepository;


//	//DBから全件取得
//	public List<LeavingworkEntity> getLeavingworkAll() {
//	   return LeavingworkEntity.findAll();
//	}

	//エンティティ（データを格納する箱）を画面データに詰め替える

	public void insert(LeavingworkForm leavingworkForm) {
	LeavingworkEntity leavingworkEntity = new LeavingworkEntity();
	leavingworkEntity.setUserId(leavingworkForm.getUserId());
	leavingworkEntity.setStatus(leavingworkForm.getStatus());
	leavingworkEntity.setEnddate(leavingworkForm.getEnddate());
	leavingworkEntity.setEndtime(LocalTime.parse(leavingworkForm.getEndtime().substring(0, 5) + ":00"));
	leavingworkEntity.setBreaktime(LocalTime.parse(leavingworkForm.getBreaktime().substring(0, 5) + ":00"));
	leavingworkEntity.setRemarks(leavingworkForm.getRemarks());
	//leavingworkEntity.setAttendance_ID(leavingworkForm.getAttendance_ID());

	 leavingworkRepository.save(leavingworkEntity);
	
		// TODO 自動生成されたメソッド・スタブ
		
	}
}