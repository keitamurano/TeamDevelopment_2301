package com.example.demo.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.ExpencesEntity;
import com.example.demo.repository.ExpencesRepository;
/**
 * ユーザー情報 Service
 */
@Service
public class ExpencesService {

  @Autowired
  private ExpencesRepository expencesRepository;

//   * 経費一覧情報 全検索
//   * @return 検索結果

  		public List<ExpencesEntity> findAll(){
  		    return expencesRepository.findAll();
  		}

}

