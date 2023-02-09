//フォームクラスは画面とコントローラークラスの間で値を渡す役割をする

package com.example.demo.form;



import java.util.Date;

import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class AttendanceForm{
	
	@NotNull
	private Integer userId;

	
	@NotNull
	private  String status;

	@NotNull
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private  Date startdate;


	@DateTimeFormat(pattern="HH:mm:ss")
	//@NotNull
	private  String starttime;

	@NotNull
	private  String remarks;
	
	//attendance_ID integer(20) NOTNULL,
}
