//DBにアクセスするためにリポジトリを呼び出す

package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.AttendanceEntity;
import com.example.demo.form.AttendanceForm;
import com.example.demo.repository.attendanceRepository;

@Service 
public class AttendanceSservice {

	//出勤報告のRepository
@Autowired
private attendanceRepository AttendanceRepository;


//DBから全件取得
public List<AttendanceEntity> getAttendancAll() {
	  return AttendanceRepository.findAll();
}

//エンティティ（データを格納する箱）を画面データに詰め替える

public void insert(AttendanceForm attendanceForm) {
AttendanceEntity attendanceEntity = new AttendanceEntity();
/*attendanceEntity.UserID(attendanceForm.getUserId());
attendanceEntity.setStatus(attendanceForm.getStatus());
AttendanceEntity.setStartdate(attendanceForm.getStartdate());
AttendanceEntity.setStarttime(attendanceForm.getStarttime());
attendanceEntity.setRemarks(attendanceForm.getRemarks());
*/
AttendanceRepository.save(attendanceEntity);
}
}


