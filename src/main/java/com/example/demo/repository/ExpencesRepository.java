package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.ExpencesEntity;

@Repository
public interface ExpencesRepository extends JpaRepository<ExpencesEntity, Integer> {
	List<ExpencesEntity> findAllByOrderByUserIdAsc();
}