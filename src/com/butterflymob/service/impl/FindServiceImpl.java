package com.butterflymob.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.butterflymob.dao.FindDao;
import com.butterflymob.service.FindService;

@Service
public class FindServiceImpl implements FindService {

	@Autowired
	private FindDao dao;
	
	@Override
	public String find() {
		int i = 9/0;
		return String.valueOf(dao.find());
	}

}
