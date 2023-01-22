package com.example.demo.form;
import java.util.Date;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;

import lombok.Data;
@Data
public class ExpencesForm {

       @NotNull
		private Integer userId;

       @NotNull
		private Date applicationDate;

       @NotNull
       @Max(20)
       private String expencesItem;

       @NotNull
       @Max(10)
		private Integer amountMoney;

       @Max(50)
		private String remarks;
	}

