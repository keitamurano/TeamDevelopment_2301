//フォームクラスは画面とコントローラークラスの間で値を渡す役割をする

package com.example.demo.form;



import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
@Table(name = "attendance")
public class AttendanceForm{

	@NotNull
	@Column(name = "user_id")
	private Integer userId;


	@NotNull
	@Column(name = "status")
	private  String status;

	@NotNull
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name = "start_date")
	private  Date startdate;


	@DateTimeFormat(pattern="HH:mm:ss")
	@Column(name = "start_time")
	//@NotNull
	private  String starttime;

	@NotNull
	@Column(name = "remarks")
	private  String remarks;

	//attendance_ID integer(20) NOTNULL,
}
