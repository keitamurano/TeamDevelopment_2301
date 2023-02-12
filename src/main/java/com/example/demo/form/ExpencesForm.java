package com.example.demo.form;

import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class ExpencesForm {

	@NotNull(message = "ユーザIDを入力してください")
	private Integer userId;

	@NotNull(message = "申請日を入力してください")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date applicationDate;

	@NotEmpty(message = "経費項目を入力してください")
	private String expencesItem;

	@NotNull(message = "金額を入力してください")
	private Integer amountMoney;

	@Size(max = 50, message = "備考は50文字以内で入力して下さい")
	private String remarks;
}
