package com.butterflymob.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.butterflymob.service.ICRM_UserService;

@Controller
@RequestMapping("/demo1")
public class CRM_UserController {
	
	@Autowired
	private ICRM_UserService user;
	
	@RequestMapping(value="/test" )
	@ResponseBody
	public Map<String,Object> testMime(){
		HashMap<String, Object> params = new HashMap<String,Object>();
//		params.put("1111", "22222");
//		response.setContentType("application/vnd.ms-excel");  
		
//		String result = user.testData();
		params.put("11111", user.testData());
		
		return params;
	}
	
	
}
