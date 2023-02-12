package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="user_tb")//table名の指定（クラス名＝テーブル名）
public class MypageEntity {
	@Id //primary key(user_id)
	@GeneratedValue(strategy = GenerationType.IDENTITY)//(AUTO指定にすると自動で値を割振る）

	@Column(name = "user_id")
	private Integer userid;

	@Column(name = "name")
	private String name;
}
