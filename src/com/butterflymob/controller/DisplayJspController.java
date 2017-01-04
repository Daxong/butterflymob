package com.butterflymob.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/display")
public class DisplayJspController {
	@RequestMapping("/get")
	public ModelAndView displays(){
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.setViewName("/jsp/index");
		return modelAndView;
		
	}

}
