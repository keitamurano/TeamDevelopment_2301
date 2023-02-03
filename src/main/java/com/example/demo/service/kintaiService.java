package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.kintaiEntity;
import com.example.demo.form.kintaiRequest;
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

	public void update(kintaiRequest kintairequest) {
		kintaiEntity kintai = findById(kintairequest.getAttendance_id());
		kintai.setUser_id(kintairequest.getUser_id());
		kintai.setStatus(kintairequest.getStatus());
		kintai.setStart_date(kintairequest.getStart_date());
		kintai.setStart_time(kintairequest.getStart_time());
		kintai.setEnd_date(kintairequest.getEnd_date());
		kintai.setEnd_time(kintairequest.getEnd_time());
		kintai.setBreak_time(kintairequest.getBreak_time());
		kintai.setRemarks(kintairequest.getRemarks());
		KintaiRepository.save(kintai);
	}

}
