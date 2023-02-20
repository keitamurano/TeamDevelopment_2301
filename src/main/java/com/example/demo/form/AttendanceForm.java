//フォームクラスは画面とコントローラークラスの間で値を渡す役割をする

package com.example.demo.form;

import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
//@Table(name = "attendance")
public class AttendanceForm{

 //@NotNull　無くて良い
 //@Column(name = "user_id")
 private Integer userId;


 @NotEmpty(message="出勤状況を選択して下さい")
 //@Column(name = "status")
 private  String status;

 @NotNull(message="出勤日を選択してください")
 @DateTimeFormat(pattern = "yyyy-MM-dd")
 //@Column(name = "start_date")
 private  Date startdate;

 @NotEmpty(message="出勤時間を選択してください")
 @DateTimeFormat(pattern="HH:mm:ss")
 //@Column(name = "start_time")
 //@NotNull
 private  String starttime;

 //@NotNull
 //@Column(name = "remarks")
 @Size(max = 200, message = "備考は200文字以内で入力して下さい")
 private  String remarks;

 //attendance_ID integer(20) NOTNULL,↓この形？
 private Integer attendance_ID;
}