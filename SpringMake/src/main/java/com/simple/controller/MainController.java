package com.simple.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

	@RequestMapping("/test/xxx")
	public ModelAndView main() {
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("xxx");
		mv.addObject("data", "hell로 월드 정말.. ");
		
		return mv;
	}
	
}
