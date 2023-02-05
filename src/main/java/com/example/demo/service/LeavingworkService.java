package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.entity.AttendanceEntity;
import com.example.demo.entity.LeavingworkEntity;

public class LeavingworkService {
	

	//出勤報告のRepositoryS
	@Autowired
	private LeavingworkEntity Leavingworkepository;


	//DBから全件取得
	public List<AttendanceEntity> getAttendancAll() {
	   return AttendanceEntity.findAll();
	}

	//エンティティ（データを格納する箱）を画面データに詰め替える

	public void insert(LeavingworkEntity leavingworkForm) {
	LeavingworkEntity leavingworkEntity = new LeavingworkEntity();
	leavingworkEntity.setUserid(leavingworkForm.getUserid());
	leavingworkEntity.setStatus(leavingworkForm.getStatus());
	leavingworkEntity.setEnddate(leavingworkForm.getEnddate());
	leavingworkEntity.setEndtime(leavingworkForm.getEndtime());
	leavingworkEntity.setBreaktime(leavingworkForm.getBreaktime());
	leavingworkEntity.setRemarks(leavingworkForm.getRemarks());

	 Leavingworkepository.save( Leavingworkepository);
	}

}
