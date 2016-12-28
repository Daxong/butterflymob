package com.butterflymob.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.butterflymob.entity.ActivityBean;

public interface ActivityMapper {
	
	public List<ActivityBean> findActivity(@Param("status")Integer status);
	
}
