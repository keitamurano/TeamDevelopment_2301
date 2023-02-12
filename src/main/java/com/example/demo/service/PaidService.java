package com.example.demo.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.PaidEntity;
import com.example.demo.repository.PaidRepository;
/**
@Service
		public class PaidService {


    @Autowired
    private PaidRepository paidRepository;


    public PaidEntity search(PaidForm paidForm) {
        return paidRepository.search(paidForm);
    }
}

 **/
//----------------------------------------------------
/**
 * ユーザー情報 Service
 */
@Service
public class PaidService {
	/**
	 * ユーザー情報 Repository
	 */
	@Autowired
	private PaidRepository paidRepository;
	/**
	 * ユーザー情報 全検索
	 * @return 検索結果
	 */
	/**public PaidEntity getOne(Integer userid) {
    return paidRepository.findById(1);
	 **/
	public PaidEntity findById(Integer userid) {
		return paidRepository.getOne(userid);
		//	  List<Integer> findByIdx(@Param("id") Integer id);
	}
}