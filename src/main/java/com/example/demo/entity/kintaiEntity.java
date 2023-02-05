package com.example.demo.entity;

import java.sql.Date;
import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "attendance")
public class kintaiEntity {

	@Column(name = "user_id")
	private Integer user_id;

	@Column(name = "status")
	private String status;

	@Column(name = "start_date")
	private Date start_date;

	@Column(name = "start_time")
	private Time start_time;

	@Column(name = "end_date")
	private Date end_date;

	@Column(name = "end_time")
	private Time end_time;

	@Column(name = "break_time")
	private Time break_time;

	@Column(name = "remarks")
	private String remarks;

	@Id
	@Column(name = "attendance_id")
	private Integer attendance_id;
}
