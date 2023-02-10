//DBにアクセスするためにリポジトリを呼び出す

package com.example.demo.service;

import java.time.LocalTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.AttendanceEntity;
import com.example.demo.form.AttendanceForm;
import com.example.demo.repository.AttendanceRepository;

@Service 
public class AttendanceService {

 //出勤報告のRepository
	
@Autowired
AttendanceRepository attendanceRepository;


//DBから全件取得
public List<AttendanceEntity> getAttendancAll() {
   return AttendanceEntity.findAll();
}

//エンティティ（データを格納する箱）を画面データに詰め替える

public void insert(AttendanceForm attendanceForm) {
AttendanceEntity attendanceEntity = new AttendanceEntity();
attendanceEntity.setUserId(1);
attendanceEntity.setStatus(attendanceForm.getStatus());
attendanceEntity.setStartdate(attendanceForm.getStartdate());
attendanceEntity.setStarttime(LocalTime.parse(attendanceForm.getStarttime().substring(0, 5) + ":00"));
attendanceEntity.setRemarks(attendanceForm.getRemarks());

attendanceRepository.save(attendanceEntity);
}
}