package com.butterflymob.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.butterflymob.dao.ActivityDao;
import com.butterflymob.entity.ActivityBean;
import com.butterflymob.mapper.ActivityMapper;

@Repository
public class ActivityDaoImpl implements ActivityDao {

	@Autowired
	ActivityMapper mapper;
	
	@Override
	public List<ActivityBean> findActivity() {
		System.out.println(mapper.findActivity(0)+"");
		return mapper.findActivity(0);
	}

}
