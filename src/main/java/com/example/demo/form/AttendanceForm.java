//フォームクラスは画面とコントローラークラスの間で値を渡す役割をする

package com.example.demo.form;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
@Table(name = "attendance")
public class AttendanceForm{

	
	@Column(name = "user_id")
	private Integer userId;


	@NotBlank(message="出勤状況を選択して下さい")
	@Column(name = "status")
	private  String status;

	@NotBlank(message="出勤日を選択してください")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name = "start_date")
	private  Date startdate;

	@NotBlank(message="出勤時間を選択してください")
	@DateTimeFormat(pattern="HH:mm:ss")
	@Column(name = "start_time")
	//@NotNull
	private  String starttime;

	//@NotNull
	@Column(name = "remarks")
	private  String remarks;

	//attendance_ID integer(20) NOTNULL,
}
