package com.butterflymob.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.butterflymob.service.FindService;

@Controller
@RequestMapping(value = "/findConn")
public class FindController {
	
	@Autowired
	FindService service;
	
	@RequestMapping(value = "/find")
	@ResponseBody
	public Object find(){
		return service.find();
	}
	
}
