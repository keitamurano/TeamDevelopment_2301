package com.example.demo.service;

import java.time.LocalTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.AttendanceEntity;
import com.example.demo.form.kintaiRequest;
import com.example.demo.repository.AttendanceRepository;

@Service
public class taikinService {

	@Autowired
	private AttendanceRepository AttendanceRepository;

	public List<AttendanceEntity> searchAll() {
		return AttendanceRepository.findAll();
	}

	public AttendanceEntity findById(Integer attendance_ID) {
		return AttendanceRepository.findById(attendance_ID).get();
	}

	public void update(kintaiRequest kintairequest) {
		AttendanceEntity kintai = findById(kintairequest.getAttendance_id());
		kintai.setUserId(kintairequest.getUser_id());
		kintai.setStatus(kintairequest.getStatus());
		kintai.setStartdate(kintairequest.getStart_date());
		kintai.setStarttime(LocalTime.parse(kintairequest.getStart_time().substring(0, 5) + ":00"));
		kintai.setEnddate(kintairequest.getEnd_date());
		kintai.setEndtime(LocalTime.parse(kintairequest.getEnd_time().substring(0, 5) + ":00"));
		kintai.setBreaktime(LocalTime.parse(kintairequest.getBreak_time().substring(0, 5) + ":00"));
		kintai.setRemarks(kintairequest.getRemarks());
		
		AttendanceRepository.save(kintai);
	}
}
