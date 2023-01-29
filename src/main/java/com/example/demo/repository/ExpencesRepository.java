package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.ExpencesEntity;
/**
 * ユーザー情報 Repository
 */
@Repository
public interface ExpencesRepository extends JpaRepository<ExpencesEntity, Integer> {
//
//	 List<ExpencesEntity>findAll();

	  /**
	   * ユーザー情報登録
	   * @param userRequest 登録用リクエストデータ
	   */
//	  public void save(ExpencesListParam expencesListParam);
}