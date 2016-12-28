package com.butterflymob.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.butterflymob.service.FindTableService;


@Controller
@RequestMapping(value = "/find")
public class FindDSTableController {

	@Autowired
	private FindTableService service;
	@ResponseBody
	@RequestMapping(value = "/findDSTable")
	public Object findDSTable(){
		return service.findTable();
	}
	
}
