package com.butterflymob.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.butterflymob.dao.FindTableDao;
import com.butterflymob.service.FindTableService;

@Service
public class FindTableServiceImpl implements FindTableService {

	@Autowired
	FindTableDao dao;
	
	@Override
	public String findTable() {
		return dao.findTable();
	}

}
