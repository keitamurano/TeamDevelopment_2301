package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entity.kintaiEntity;
import com.example.demo.form.kintaiRequest;
import com.example.demo.service.kintaiService;
import com.example.demo.service.taikinService;

@Controller
public class taikinController {

	@Autowired
	kintaiService KintaiService;

	@Autowired
	taikinService TaikinService;

	@GetMapping("/leaving/{attendance_id}")
	public String view(@PathVariable Integer attendance_id, Model model) {
		kintaiEntity KintaiEntity = KintaiService.findById(attendance_id);
		kintaiRequest KintaiRequest = new kintaiRequest();
		KintaiRequest.setAttendance_id(KintaiEntity.getAttendance_id());
		KintaiRequest.setUser_id(KintaiEntity.getUser_id());
		KintaiRequest.setStatus(KintaiEntity.getStatus());
		KintaiRequest.setStart_date(KintaiEntity.getStart_date());
		KintaiRequest.setStart_time(KintaiEntity.getStart_time());
		KintaiRequest.setEnd_date(KintaiEntity.getEnd_date());
		KintaiRequest.setEnd_time(KintaiEntity.getEnd_time());
		KintaiRequest.setBreak_time(KintaiEntity.getBreak_time());
		KintaiRequest.setRemarks(KintaiEntity.getRemarks());

		model.addAttribute("KintaiRequests", KintaiRequest);

		return "taikin";
	}

	@PostMapping("/leaving/update")
	public String update(@Validated @ModelAttribute kintaiRequest KintaiRequests, BindingResult result, Model model) {
		if (result.hasErrors()) {
			List<String> errorList = new ArrayList<String>();
			for (ObjectError error : result.getAllErrors()) {
				errorList.add(error.getDefaultMessage());
			}
			model.addAttribute("KintaiRequests",new kintaiRequest());
			model.addAttribute("validationError", errorList);

			return "taikin";
		}

		// ユーザー情報の更新
		TaikinService.update(KintaiRequests);
		model.addAttribute("kintaiRequests",KintaiRequests);

		return "redirect:/mypage/kintaiichiran";
	}
}