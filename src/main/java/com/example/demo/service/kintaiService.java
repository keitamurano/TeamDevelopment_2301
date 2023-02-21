package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.kintaiEntity;
import com.example.demo.repository.kintaiRepository;

@Service
public class kintaiService {

	@Autowired
	private kintaiRepository KintaiRepository;

	public List<kintaiEntity> searchAll() {
		return KintaiRepository.findAll();
	}

	public kintaiEntity findById(Integer attendance_id) {
		return KintaiRepository.findById(attendance_id).get();
	}
}
