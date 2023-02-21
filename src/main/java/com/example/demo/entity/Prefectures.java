package com.example.demo.entity;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Entity
@Data
@Table(name = "prefectures")
public class Prefectures implements Serializable {
	@Id
	@Column(name = "code")
	private String code;

	@Column(name = "name")
	private String name;
}