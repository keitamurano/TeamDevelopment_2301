package com.example.demo.entity;

import java.util.Date;
import jakarta.persistence.Table;
import lombok.Data;
import schoo.entity.Event;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Data
@Entity
@Table(name="expences")
public class ExpencesEntity{

    // 予約データの主キーはユーザーID
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id")
    private Integer userId;

	@Column(name = "application_date")
    private Date applicationDate;

	@Column(name = "expences_item")
    private String expencesItem;

	@Column(name = "amount_money")
    private Integer amountMoney;

	@Column(name = "remarks")
    private String remarks;
}