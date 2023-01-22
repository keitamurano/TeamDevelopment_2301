/**package com.example.demo.entity;

	

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
**/
	/**
	 * ユーザー情報 Entity
	 * @param <integer>
	 */
/**	@Entity
	@Table(name = "paid")
	public class PaidEntity<integer>  implements Serializable {
	  /**
	   * 有休休暇
	   */
/**	  @Id
	  @Column(name = "user_id")
	  private integer user_id;
	  
	  @Column(name = "paidholiday")
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  private integer paidholiday;
	  /**
	   * 誕生日休暇
	   */
/**	  @Column(name = "birthdayholiday")
	  private integer birthdayholiday;
	  /**
	   * 記念日休暇
	   */
/**	  @Column(name = "anniversaryholiday")
	  private integer anniversaryholiday;
	  /**
	   * 特別休暇
	   */
/**	  @Column(name = "specialholiday")
	  private integer specialholiday;
	}**/
