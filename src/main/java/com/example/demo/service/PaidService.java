package com.example.demo.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.PaidEntity;
import com.example.demo.repository.PaidRepository;
/**
 * ユーザー情報 Service
 */
@Service
public class PaidService {
	/**
	 * ユーザー情報 Repository
	 */
	@Autowired
	private PaidRepository paidRepository;
	/**
	 * ユーザー情報 全検索
	 * @return 検索結果
	 */
	public PaidEntity findById(Integer userid) {
		return paidRepository.getOne(userid);
	}
}