package com.example.demo.service;

import java.util.ArrayList;

import com.example.demo.entity.NewuserEntity;


public interface NewuserService {
String greet(int i); //挨拶を返す
	
	ArrayList<NewuserEntity> getAll(); //全てのNewuserEntityを返す

}
