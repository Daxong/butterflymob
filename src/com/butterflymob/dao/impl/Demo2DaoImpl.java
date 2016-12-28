package com.butterflymob.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.butterflymob.dao.Demo2Dao;
import com.butterflymob.mapper.Demo2Mapper;

@Repository
public class Demo2DaoImpl implements Demo2Dao{
	
	@Autowired
	private Demo2Mapper mapper;
	
	@Override
	public String findMinDate() {
		return mapper.queryMixRecommend();
	}
	
}
