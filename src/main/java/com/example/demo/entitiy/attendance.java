
/*DBのレコードを表現するJavaクラス
 * データの入れ物となるクラス（DBの行に対応するように作成する）*/


package com.example.demo.entitiy;

import java.sql.Date;
import java.sql.Time;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="attendance")//table名の指定（クラス名＝テーブル名）
public class attendance{

  
    @Id //primary key(attendance_id)
    @GeneratedValue(strategy = GenerationType.IDENTITY)//(AUTO指定にすると自動で値を割振る）
    
	@Column(name = "attendance_id")
    private Integer userId;

	@Column(name = "status")
    private String status;

	@Column(name = "start_date")
    private Date startdate;

	@Column(name = "start_time")
    private Time starttime;
	
	@Column(name = "remarks")
    private String remarks;
	
	@Column(name = "attendance_id")
    private Integer attendanceid;
}