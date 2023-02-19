package com.example.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.UserEntity;
/**
 * ユーザー情報 Repository
 */
@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {
//		 List<UserEntity> findById(Long user_id);
}