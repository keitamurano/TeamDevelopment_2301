package com.example.demo.form;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;
@Data
public class ExpencesForm {

//       @NotNull
		private Integer userId;

//       @NotNull
		@DateTimeFormat(pattern="yyyy-MM-dd")
		private Date applicationDate;

//       @NotNull
//       @Max(20)
       private String expencesItem;


//       @NotNull
//       @Max(10)
		private Integer amountMoney;

//       @Max(50)
		private String remarks;
	}

