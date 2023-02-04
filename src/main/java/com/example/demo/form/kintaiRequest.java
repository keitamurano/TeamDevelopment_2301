package com.example.demo.form;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;

import lombok.Data;

@Data
public class kintaiRequest implements Serializable  {


	private Integer user_id;


	private String status;


	private Date start_date;


	private Time start_time;


	private Date end_date;


	private Time end_time;


	private Time break_time;

	private String remarks;

	private Integer attendance_id;
}
