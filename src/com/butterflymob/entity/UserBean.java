package com.butterflymob.entity;

import java.io.Serializable;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Component("userBean")
public class UserBean implements Serializable {
	
	private String name = "";
	private String age = "";
	
	public String getName(){
		return name;
	}
	public String getAge(){
		return age;
	}
	public void setName(String name){
		this.name = name;
	}
	public void setAge(String age){
		this.age = age;
	}
	
}
