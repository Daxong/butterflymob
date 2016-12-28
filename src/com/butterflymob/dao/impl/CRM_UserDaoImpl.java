package com.butterflymob.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.butterflymob.dao.ICRM_UserDao;
import com.butterflymob.mapper.VideoRecommendMapper;

@Repository
public class CRM_UserDaoImpl implements ICRM_UserDao  {
 
	@Autowired
	VideoRecommendMapper mapper;
	@Override
	public String testData() {
		return mapper.queryMixRecommend();
	}

}
