package com.butterflymob.controller;

import com.butterflymob.entityex.TodayDataTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.butterflymob.service.FindBaseInfo;



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
	@Autowired
	private FindBaseInfo findBaseInfo;

	@RequestMapping("/Todaydata")
	public @ResponseBody TodayDataTable TodaydataJson(){
		//返回json数据
		TodayDataTable  todayDataTable =new TodayDataTable();
		todayDataTable.setBackCount(findBaseInfo.getCountBack());
		todayDataTable.setBackRate(findBaseInfo.getBackRate());
		todayDataTable.setGrantUsr(findBaseInfo.getCountUsr());
		todayDataTable.setShareCount(findBaseInfo.getCountShares());
		todayDataTable.setShareRate(findBaseInfo.getSharerate());

		return todayDataTable;
		
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
