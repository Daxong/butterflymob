package com.butterflymob.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.butterflymob.entity.CRM_User;

@Controller
@RequestMapping("/demo")
public class DemoController {

	/**
	 * 返回json
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/json")
	public Object getJson(){
		return new CRM_User("id11111", "pass11111", "name11111", "email11111", "12312312", 123123123l);
	}
	
	/**
	 * 返回ModelAndView
	 * @return
	 */
	@RequestMapping("/mav")
	public ModelAndView getMAV(String attr1){
		System.out.println("attr1: "+attr1);
		Map<String, String> model = new HashMap<>();
		model.put("key1", "kkkkkkkkkkkkkkkk");
		model.put("key2", "aaaaaaaaaaaaaaaaaa");
		return new ModelAndView("demo", model);
	}
	
	/**
	 * 重定向,带参数
	 * @return
	 */
	@RequestMapping("/red")
	public Object red(RedirectAttributes attr){
		attr.addAttribute("attr1", "重定向的参数");
		return "redirect:mav";
	}
	@RequestMapping(value="/findVal1")
	@ResponseBody
	public ResponseEntity<?> findVal1( String name){
		return new ResponseEntity<>("1111",HttpStatus.OK);
	}
	
	@RequestMapping(value="/findVal2")
	@ResponseBody
	public Map<String,Object> findVal2(HttpServletResponse resp,String name){
		HashMap<String,Object> map = new HashMap<String, Object>();
		map.put("111", "22222");
		return map;
	}
	
	
}
