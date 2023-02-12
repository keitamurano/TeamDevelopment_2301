package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.UserEntity;
import com.example.demo.form.UserRequest;
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
	public UserEntity findById(Long id) {
		return userRepository.findById(id).get();
	}

	/**
	 * ユーザー情報 更新
	 * @param user ユーザー情報
	 */
	public void update(UserRequest userUpdateRequest) {
		UserEntity user = findById(userUpdateRequest.getUser_id());
		user.setName(userUpdateRequest.getName());
		user.setName_kana(userUpdateRequest.getName_kana());
		user.setMail_address(userUpdateRequest.getMail_address());
		user.setPassword(userUpdateRequest.getPassword());
		userRepository.save(user);
	}

}
