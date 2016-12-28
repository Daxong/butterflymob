package com.butterflymob.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.butterflymob.dao.ActivityDao;
import com.butterflymob.entity.ActivityBean;
import com.butterflymob.service.ActivityService;

@Service
public class ActivityServiceImpl implements ActivityService{

	@Autowired
	ActivityDao dao;
	
	@Override
	public List<ActivityBean> findActivity() {
		return dao.findActivity();
	}

}
