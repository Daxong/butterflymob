package com.butterflymob.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.butterflymob.dao.ICRM_UserDao;
import com.butterflymob.service.ICRM_UserService;

@Service
public class CRM_UserServiceImpl implements ICRM_UserService {

	@Autowired
	private ICRM_UserDao dao;
	
	@Override
	public String testData() {
	   return dao.testData();
	}

}
