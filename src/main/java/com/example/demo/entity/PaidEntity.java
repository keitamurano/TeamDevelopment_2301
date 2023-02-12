package com.example.demo.entity;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table( name="paid" )
public class PaidEntity implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id")
	private Integer userid;

	@Column(name = "paid_holiday")
	private Integer paidholiday;

	@Column(name = "birthday_holiday")
	private Integer birthdayholiday;

	@Column(name = "annversary_holiday")
	private Integer anniversaryholiday;

	@Column(name = "special_holiday")
	private Integer specialholiday;



}
