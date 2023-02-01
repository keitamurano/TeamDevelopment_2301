package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.MypageEntity;
import com.example.demo.repository.MypageRepository;


@Service
public class MypageService {

	  @Autowired
	  private MypageRepository mypageRepository;

	  public MypageEntity findById(Integer userid) {
	        return mypageRepository.getOne(userid);

	  }
}
