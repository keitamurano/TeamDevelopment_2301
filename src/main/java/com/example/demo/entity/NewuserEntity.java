package com.example.demo.entity;

public class NewuserEntity {
	
	private int id;
	private String name;
	private String name_kana;
	private String mail_address;
	private String password;
	
	public NewuserEntity() {}
	
	public NewuserEntity(int id,String name,String name_kana,String mail_address,String password) {
		this.id = id;
		this.name = name;
		this.name_kana = name_kana;
		this.mail_address = mail_address;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName_kana() {
		return name_kana;
	}

	public void setName_kana(String name_kana) {
		this.name_kana = name_kana;
	}

	public String getMail_address() {
		return mail_address;
	}

	public void setMail_address(String mail_address) {
		this.mail_address = mail_address;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
	
		
	

}





