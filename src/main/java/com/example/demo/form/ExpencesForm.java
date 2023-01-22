package com.example.demo.form;
import java.util.Date;

import lombok.Data;
@Data
public class ExpencesForm {


		private Integer userId;

		private Date applicationDate;

		private String expencesItem;

		private Integer amountMoney;

		private String remarks;
	}

