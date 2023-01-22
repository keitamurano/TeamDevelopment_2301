package com.example.demo.form;

import com.sun.istack.NotNull;

import lombok.Data;
@Data
public class ExpencesForm {


       @NotNull
		private Integer userId;
       @NotNull
//		private Date applicationDate;
       @NotNull
		private String expencesItem;
       @NotNull
		private Integer amountMoney;

		private String remarks;
	}

