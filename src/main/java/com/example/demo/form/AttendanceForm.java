//フォームクラスは画面とコントローラークラスの間で値を渡す役割をする

package com.example.demo.form;

import java.sql.Date;
import java.sql.Time;

import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
public class AttendanceForm{
	
	@NotNull
	private Integer userId;

	
	@NotNull
	private  String status;

	@NotNull
	private  Date startdate;


	@NotNull
	private  Time starttime;

	@NotNull
	private  String remarks;
	
	//attendance_ID integer(20) NOTNULL,
	

	

}
