package com.example.demo.form;
import java.util.Date;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;
@Data
public class ExpencesForm {

       @NotNull
		private Integer userId;

       @NotNull
		@DateTimeFormat(pattern="yyyy-MM-dd")
		private Date applicationDate;

       @NotNull
       @Max(20)
       private String expencesItem;


       @NotNull
//       @Max(10)
       @Size(min=3,max = 10, message = "半角数字10文字以内で入力して下さい")
		private Integer amountMoney;

       @Max(50)
		private String remarks;
	}

