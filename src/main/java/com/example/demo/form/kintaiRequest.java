//勤怠FORM
package com.example.demo.form;



import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class kintaiRequest{

	private Integer user_id;

	@NotEmpty(message="退勤状況を選択して下さい")
	private String status;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date start_date;

	@DateTimeFormat(pattern="HH:mm:ss")
	private String start_time;

	@NotNull(message="退勤日を選択してください")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date end_date;

	@NotEmpty(message="退勤時間を選択してください")
	@DateTimeFormat(pattern="HH:mm:ss")
	private String end_time;

	@NotEmpty(message="休憩時間を選択してください")
	@DateTimeFormat(pattern="HH:mm:ss")
	private String break_time;

	@Size(max = 200, message = "備考は200文字以内で入力して下さい")
	private String remarks;

	private Integer attendance_id;
}
