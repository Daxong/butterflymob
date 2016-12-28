package com.butterflymob.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.butterflymob.dao.FindTableDao;
import com.butterflymob.mapper.FindTableMapper;
import com.butterflymob.service.FindTableService;

@Repository
public class FindTableDaoImpl implements FindTableDao {

	@Autowired
	private FindTableMapper mapper;
	
	@Override
	public String findTable() {
		return mapper.findTable();
	}

}
