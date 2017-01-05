package com.butterflymob.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class JspController {		
	/**
	 * 示范方法
	 * @return
	 */
	@RequestMapping("/get")
	public ModelAndView displays(){
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.setViewName("/jsp/index");
		return modelAndView;
		
	}
	/**
	 * 给jsp页面传送 今日数据 所需数据
	 * @return
	 */
	@RequestMapping("/getTodaydata")
	public ModelAndView getTodaydata(){
		return null;
		
	}
	/**
	 * 传递top版本数据
	 * @return
	 */
	@RequestMapping("/getTopvison")
	public ModelAndView getTopversion(){
		return null;
	}
	/**
	 * 传递分时段数据  需要分析
	 * @return
	 */
	@RequestMapping("/getPartdata")
	public ModelAndView getPartdata(){
		return null;
	}

}
