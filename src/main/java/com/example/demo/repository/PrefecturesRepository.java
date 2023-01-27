package com.example.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Prefectures;
/**
 * 都道府県マスタ Repository
 */
@Repository
public interface PrefecturesRepository extends JpaRepository<Prefectures, Long> {
}