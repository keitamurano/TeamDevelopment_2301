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
@Table(name = "user_tb")
public class UserEntity {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id")
	private Integer user_id;

	@Column(name = "name")
	private String name;

	@Column(name = "name_kana")
	private String name_kana;

	@Column(name = "mail_address")
	private String mail_address;

	@Column(name = "password")
	private String password;
}
