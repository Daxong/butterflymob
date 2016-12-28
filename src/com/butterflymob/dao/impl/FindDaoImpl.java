package com.butterflymob.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.butterflymob.dao.FindDao;
import com.butterflymob.mapper.FindMapper;

@Repository
public class FindDaoImpl implements FindDao {
	
	@Autowired
	FindMapper findMapper;

	@Override
	public int find() {
		
		for(int i = 0;i < 3;i++){
			if(i == 0)
				findMapper.find(i);
			else {
				int x = 9/0;
			}
		}
		
		return findMapper.find(3);
	}

}
