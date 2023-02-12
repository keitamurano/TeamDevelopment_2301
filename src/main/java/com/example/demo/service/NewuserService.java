package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.UserEntity;
import com.example.demo.form.UserRequestForm;
import com.example.demo.repository.UserRepository;

@Service
public class NewuserService {
	 /**
     * ユーザー情報 Repository
     */
  @Autowired
UserRepository userRepository;
	
	 /**
	   * ユーザー情報 新規登録
	   * @param user ユーザー情報
	   */
	  public void create(UserRequestForm userRequest) {
	    UserEntity user = new UserEntity();
	    
	    user.setName(userRequest.getName());
	    user.setName_kana(userRequest.getName_kana());
	    user.setMail_address(userRequest.getMail_address());
	    user.setPassword(userRequest.getPassword());

	    userRepository.save(user);
	  }


  

}
