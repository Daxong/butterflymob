package com.butterflymob.util;

import org.springframework.beans.factory.annotation.Autowired;

import com.butterflymob.service.ICRM_UserService;

public class QuartzJob {
	
	@Autowired
	private ICRM_UserService user;
	
    public void work()
    {
      System.out.println(user.testData());
    }
}
