package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.UserEntity;
import com.example.demo.form.UserRequestForm;
import com.example.demo.repository.UserRepository;

@Service
public class EditService {
	/**
	* ユーザー情報 Repository
	*/
	@Autowired
	UserRepository userRepository;

	/**
	 * ユーザー情報 全検索
	 * @return 検索結果
	 */
	public List<UserEntity> searchAll() {
		return userRepository.findAll();
	}

	/**
	 * ユーザー情報 主キー検索
	 * @return 検索結果
	 */
	public UserEntity findById(Long user_id) {
		return userRepository.findById(user_id).get();
	}

	/**
	 * ユーザー情報 更新
	 * @param user ユーザー情報
	 */
	public void update(UserRequestForm userRequestForm) {
		UserEntity user = findById(userRequestForm.getUser_id());
		user.setUser_id(userRequestForm.getUser_id());
		user.setName(userRequestForm.getName());
		user.setName_kana(userRequestForm.getName_kana());
		user.setMail_address(userRequestForm.getMail_address());
		user.setPassword(userRequestForm.getPassword());
		userRepository.save(user);
	}

}
