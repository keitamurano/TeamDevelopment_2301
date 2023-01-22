package com.example.demo.form;


import com.sun.istack.NotNull;

import lombok.Data;

@Data
public class ExpencesForm {
	  @NotNull
		private Integer userId;
//		private Date applicationDate;
	  @NotNull
		private String expencesItem;
	  @NotNull
		private Integer amountMoney;
	  @NotNull
		private String remarks;
	}

