//フォームクラスは画面とコントローラークラスの間で値を渡す役割をする

package com.example.demo.form;

import javax.validation.constraints.NotNull;

import lombok.Data;


@Data

public class attendance {
	
	@NotNull
	private Integer userId;

	
	@NotNull
	private  String status;

	@NotNull
	private  Data startdate;


	@NotNull
	private  Data starttime;

	@NotNull
	private  String remarks;
	
	//attendance_ID integer(20) NOTNULL,
	

	

}
