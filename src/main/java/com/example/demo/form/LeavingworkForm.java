
//フォームクラスは画面とコントローラークラスの間で値を渡す役割をする

package com.example.demo.form;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
@Table(name = "leavingwork")
public class LeavingworkForm{
	
	@NotNull
	@Column(name = "user_id")
	private Integer userId;

	@NotNull
	@Column(name = "status")
	private  String status;

//	@NotNull
//	@DateTimeFormat(pattern = "yyyy-MM-dd")
//	@Column(name = "start_date")
//	private  Date startdate;

//	@DateTimeFormat(pattern="HH:mm:ss")
//	//@NotNull
//	private  String starttime;
	
	@NotNull
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name = "end_date")
	private  Date enddate;
	

	@DateTimeFormat(pattern="HH:mm:ss")
	@Column(name = "end_time")
	//@NotNull
	private  String endtime;
	
	@DateTimeFormat(pattern="HH:mm:ss")
	@Column(name = "break_time")
	//@NotNull
	private  String breaktime;

	@NotNull
	@Column(name = "remarks")
	private  String remarks;

	}
	
	//attendance_ID integer(20) NOTNULL,
