package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.attendanceRepository;



@Service
public class kintaiService {

	  @Autowired
	  private attendanceRepository userRepository;

	  public List<attendanceRepository> searchAll() {
	    return userRepository.findAll();
	  }
	
}
