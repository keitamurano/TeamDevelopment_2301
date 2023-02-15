
//フォームクラスは画面とコントローラークラスの間で値を渡す役割をする

package com.example.demo.form;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
@Table(name = "leavingwork")
public class LeavingworkForm{
	
	//@NotNull
	@Column(name = "user_id")
	private Integer userId;

	@NotEmpty(message="退勤状況を選択して下さい")
	@Column(name = "status")
	private  String status;

//	@NotNull
//	@DateTimeFormat(pattern = "yyyy-MM-dd")
//	@Column(name = "start_date")
//	private  Date startdate;

//	@DateTimeFormat(pattern="HH:mm:ss")
//	//@NotNull
//	private  String starttime;
	
	@NotNull(message="退勤日を選択してください")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name = "end_date")
	private  Date enddate;
	
	@NotEmpty(message="退勤時間を選択してください")
	@DateTimeFormat(pattern="HH:mm:ss")
	@Column(name = "end_time")
	//@NotNull
	private  String endtime;
	
	@NotEmpty(message="休憩時間を選択してください")
	@DateTimeFormat(pattern="HH:mm:ss")
	@Column(name = "break_time")
	//@NotNull
	private  String breaktime;

	//@NotNull
	@Column(name = "remarks")
	@Size(max = 200, message = "備考は200文字以内で入力して下さい")
	private  String remarks;

	}
	
	//attendance_ID integer(20) NOTNULL,
