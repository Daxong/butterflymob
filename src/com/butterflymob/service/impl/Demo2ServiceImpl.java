package com.butterflymob.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.butterflymob.dao.Demo2Dao;
import com.butterflymob.service.Demo2Service;

@Service
public class Demo2ServiceImpl implements Demo2Service {

	@Autowired
	private Demo2Dao dao;
	
	@Override
	public String findMinDate() {
		return dao.findMinDate();
	}
	
	

}
