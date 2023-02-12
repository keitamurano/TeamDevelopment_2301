package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.MypageEntity;

@Repository
public interface MypageRepository extends JpaRepository<MypageEntity, Integer> {
}
