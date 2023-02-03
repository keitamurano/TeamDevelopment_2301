package com.example.demo.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.ui.Model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Data
@Table(name = "employee")
public class Employee {
 private static void  init(Model model) {
 
		        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		        //Principalからログインユーザの情報を取得
		        String userId = auth.getName();
		        model.addAttribute("userId", userId);
 }
 /**
  * ID
  */
 @Id
 @Column(name = "user_id")
// @GeneratedValue(strategy = GenerationType.IDENTITY)
 private String user_id;
 /**
  * 名前
  */
 @Column(name = "name")
 private String name;
 /**
  * カナ
  */
 @Column(name = "name_kana")
 private String name_kana;
 /**
  * パスワード
  */
 @Column(name = "password")
 @Getter
 @Setter
 private String password;
 /**
  * メールアドレス
  */
 @Column(name = "upn")
 private String upn;
 /**
  * 生年月日
  */
 @Column(name = "birthday")
 @DateTimeFormat(pattern = "yyyy-MM-dd")
 private  Date birthday;
 /**
  * 性別
  */
 @Column(name = "gender")
 private Integer gender;
 
 @Column(name = "prefecture_code")
 private Integer prefecture_code;

 @Column(name = "department_code")
 private Integer department_code;
 

 @Column(name = "entry_date")
 @DateTimeFormat(pattern = "yyyy-MM-dd")
 private  Date entry_date;
	}