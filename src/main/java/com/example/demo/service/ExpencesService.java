package com.example.demo.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.ExpencesEntity;
import com.example.demo.entity.Prefectures;
import com.example.demo.form.ExpencesForm;
import com.example.demo.repository.ExpencesRepository;
import com.example.demo.repository.PrefecturesRepository;
/**
 * ユーザー情報 Service
 */
@Service
@Transactional
public class ExpencesService {

	@Autowired
	ExpencesRepository expencesRepository;

	@Autowired
	PrefecturesRepository prefecturesRepository;


	//  DBから全件取得
	public List<Prefectures> findAll2() {
		return prefecturesRepository.findAll();
	}

//	public List<ExpencesEntity> findAll() {
//		return expencesRepository.findAll();
//	}

	public List<ExpencesEntity> findAllByOrderByUserIdAsc() {
	return expencesRepository.findAllByOrderByUserIdAsc();
}


	/**
	 * 経費申請新規登録
	 * @param user ユーザー情報
	 */
	public void insert(ExpencesForm expencesForm) {
		//	  expencesRepository.save(CreateExpences(expencesListParam));
		//  }

		//  public void create(ExpencesListParam expencesListParam) {
		//	  expencesRepository.save(CreateExpences(expencesForm));
		//  }
		/**
		 * ユーザーTBLエンティティの生成
		 * @param userRequest ユーザー情報リクエストデータ
		 * @return ユーザーTBLエンティティ
		 */
		//  private ExpencesEntity CreateExpences(ExpencesListParam expencesListParam) {

		//      ExpencesEntity expencesEntity = new ExpencesEntity();
		//
		//      expencesEntity.setUserId(expencesForm.getUserId());
		//      expencesEntity.setApplicationDate(expencesForm.getApplicationDate());
		//      expencesEntity.setExpencesItem(expencesForm.getExpencesItem());
		//      expencesEntity.setAmountMoney(expencesForm.getAmountMoney());
		//      expencesEntity.setRemarks(expencesForm.getRemarks());
		//      // データベースに登録する
		//      expencesRepository.save(expencesEntity);

		ExpencesEntity expencesEntity = new ExpencesEntity();

//		BeanUtils.copyProperties(expencesForm,expencesEntity);

		expencesEntity.setUserId(expencesForm.getUserId());
		expencesEntity.setApplicationDate(expencesForm.getApplicationDate());
		expencesEntity.setExpencesItem(expencesForm.getExpencesItem());
		expencesEntity.setAmountMoney(expencesForm.getAmountMoney());
		expencesEntity.setRemarks(expencesForm.getRemarks());
		// データベースに登録する
		expencesRepository.save(expencesEntity);
	}

	//  private ExpencesEntity CreateExpences(ExpencesForm ExpencesForm) {
	//
	//      ExpencesEntity expencesEntity = new ExpencesEntity();
	//
	//      expencesEntity.setUserId(expencesListParam.getUserId());
	//      expencesEntity.setApplicationDate(expencesListParam.getApplicationDate());
	//      expencesEntity.setExpencesItem(expencesListParam.getExpencesItem());
	//      expencesEntity.setAmountMoney(expencesListParam.getAmountMoney());
	//      expencesEntity.setRemarks(expencesListParam.getRemarks());
	////      return expencesEntity;
	//      // データベースに登録する
	//      expencesRepository.save(expencesEntity);
	//  }



	/**
	 * ユーザー情報 新規登録
	 * @param user ユーザー情報
	 */

	////  経費申請登録
	////@return 検索結果
	//  public void  create(ExpencesForm expencesForm,PrefecturesForm prefecturesForm) {
	//	  ExpencesEntity ExpencesEntity = new ExpencesEntity();
	////	  Prefectures prefectures = new Prefectures();
	//	  ExpencesEntity.setUserId(expencesForm.getUserId());
	//	  ExpencesEntity.setApplicationDate(expencesForm.getApplicationDate());
	//	  ExpencesEntity.setAmountMoney(expencesForm.getAmountMoney());
	//	  ExpencesEntity.setRemarks(expencesForm.getRemarks());
	////	  prefectures.setCode(prefecturesForm.getCode());
	////	  prefectures.setName(prefecturesForm.getName());
	//	  expencesRepository.save(ExpencesEntity);
	////	  prefecturesRepository.save(prefectures);
	//  }

//	public static Prefectures create2() {
//
//		Prefectures prefectures = new Prefectures();
//		prefectures.getCode();
//		prefectures.getName();
//		return prefectures;
//	}

	/**
	 * ユーザー情報 Repository
	 */
	/**
	 * ユーザー情報 全検索
	 * @return 検索結果
	 */
	//  public List<ExpencesEntity> All() {
	//    return expencesRepository.findAll();
	//  }
	/**
	 * ユーザー情報 新規登録
	 * @param user ユーザー情報
	 */
	//  public void create(ExpencesForm ExpencesForm,Prefectures prefectures) {
	//	  ExpencesEntity expencesEntity = new ExpencesEntity();
	//	  expencesEntity.setUserId(ExpencesForm.getUserId());
	//	  expencesEntity.setApplicationDate(ExpencesForm.getApplicationDate());
	//	  expencesEntity.setAmountMoney(ExpencesForm.getAmountMoney());
	//	  expencesEntity.setRemarks(ExpencesForm.getRemarks());
	//	  expencesRepository.save(expencesEntity);
	//
	//	  Prefectures prefectures = new Prefectures();
	//	  prefectures.setName(Prefectures.getName());
	//	  prefecturesRepository.save(prefectures);
	//  }






	//
	//
	////  経費申請テーブルで値を保持する
	//  public ExpencesEntity saveing(ExpencesEntity expencesEntity) {
	//	  return expencesRepository.save(expencesEntity);
	//  }
	//
	//  public List<ExpencesEntity> getExpencesEntity() {
	//      return expencesRepository.findAll();
	//  }
	//
	//
	//  public Prefectures saveing2(Prefectures prefectures) {
	//	  return prefecturesRepository.save(prefectures);
	//  }
	//
	public List<Prefectures> getPrefecturesAll() {
		return prefecturesRepository.findAll();
	}









//	/**
//	 * 経費申請情報 全検索
//	 * @return 検索結果
//	 */
//	public ExpencesListParam searchAll() {
//		// 経費申請情報の取得
//		List<ExpencesEntity> expencesList = expencesRepository.findAll();
//
//		ExpencesListParam expencesListParam = new ExpencesListParam();
//		List<ExpencesForm> list = new ArrayList<ExpencesForm>();
//
//		// エンティティを画面データに詰め替える
//		for(ExpencesEntity expences : expencesList) {
//			ExpencesForm data = new ExpencesForm();
//
//			data.setUserId(expences.getUser_Id());
//			data.setApplicationDate(expences.getApplicationDate());
//			data.setExpencesItem(expences.getExpencesItem());
//			data.setAmountMoney(expences.getAmountMoney());
//			data.setRemarks(expences.getRemarks());
//			list.add(data);
//		}
//		expencesListParam.setUserDataList(list);
//		return expencesListParam;
//	}

}


