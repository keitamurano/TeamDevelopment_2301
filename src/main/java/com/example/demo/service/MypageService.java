package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.MypageRepository;

@Service

public class MypageService {

	  /**
	   * ユーザー情報 Repository
	   */
	  @Autowired
	  private MypageRepository mypageRepository;
	  
}

	
	
	
