package com.butterflymob.mapper;

import org.apache.ibatis.annotations.Param;

public interface FindMapper {
	/**
	 * 查询最小推荐日期
	 * @return
	 */
	int find(@Param("status")Integer status);
}
