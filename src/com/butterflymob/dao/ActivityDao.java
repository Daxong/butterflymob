package com.butterflymob.dao;

import java.util.List;

import com.butterflymob.entity.ActivityBean;

public interface ActivityDao {
	public List<ActivityBean> findActivity();
}
