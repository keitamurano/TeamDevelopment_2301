package com.example.demo.form;

import java.io.Serializable;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.springframework.stereotype.Component;

import lombok.Data;

/**
 * ユーザー情報 リクエストデータ
 */
@Data
@Component
public class UserRequestForm implements Serializable {

	private Long user_id;
	/**
	 * 名前
	 */
	@NotEmpty(message = "名前を入力してください")
	@Size(max = 20, message = "名前は20桁以内で入力してください")
	private String name;
	/**
	 * 名前カナ
	 */
	@NotEmpty(message = "名前カナを入力してください")
	@Size(max = 50, message = "名前は50桁以内で入力してください")
	private String name_kana;
	/**
	 * メールアドレス
	 */
	//	@Email(message = "正しい形式で入力してください")
	@NotEmpty(message = "E-mailを入力してください")
	private String mail_address;
	/**
	 * パスワード
	 */
	@NotEmpty(message = "Passwordを入力してください")
	private String password;

}