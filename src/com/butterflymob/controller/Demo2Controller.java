package com.butterflymob.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.butterflymob.service.Demo2Service;

@Controller
@RequestMapping(value = "/demo2")
public class Demo2Controller {

	@Autowired
	private Demo2Service service;
	
	@ResponseBody
	@RequestMapping(value = "/findMinDate")
	public Object findMinDate(){
		return service.findMinDate();
	}
	
	
}
