package com.example.demo.entity;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
/**
 * 都道府県マスタ Entity
 */
@Entity
@Data
@Table(name = "prefectures")
public class Prefectures implements Serializable {
    /**
     * 都道府県コード
     */
    @Id
    @Column(name = "code")
    private String code;
    /**
     * 都道府県名
     */
    @Column(name = "name")
    private String name;
}