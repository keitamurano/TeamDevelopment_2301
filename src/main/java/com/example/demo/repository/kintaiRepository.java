package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.kintaiEntity;

@Repository
public interface kintaiRepository extends JpaRepository<kintaiEntity, Integer> {

}