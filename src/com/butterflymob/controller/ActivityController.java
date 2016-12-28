package com.butterflymob.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.butterflymob.service.ActivityService;


@Controller
@RequestMapping(value = "/activity")
public class ActivityController {
	
	@Autowired
	ActivityService service;
	
	@RequestMapping("/findActivity")
	@ResponseBody
	public Object findActivity(){
		return service.findActivity();
	}
	
	
	
	public ModelAndView getConlusion(){
		
		
		
		return null;
	}
	
}
