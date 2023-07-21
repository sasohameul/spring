package com.simple.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;
import org.springframework.web.servlet.mvc.multiaction.NoSuchRequestHandlingMethodException;

//핸들러 어댑터에 연결이 되려면 특정 클래스를 상속을 받습니다.
public class HomeController extends MultiActionController{

	//alt+shift+s 의 override/implement methods의 handleNoSuchRequestHandlingMethod
	@Override
	protected ModelAndView handleNoSuchRequestHandlingMethod(NoSuchRequestHandlingMethodException ex,
			HttpServletRequest request, HttpServletResponse response) throws Exception {

		String uri = request.getRequestURI();
		String path = uri.substring(request.getContextPath().length());
		
		System.out.println(path);
		
		if(path.equals("/test/xxx")) {
			
			System.out.println("xxx 메서드");
			ModelAndView mv = new ModelAndView();
//			mv.setViewName("/WEB-INF/views/xxx.jsp");
			mv.setViewName("xxx"); // /WEV-INF/views를 떼고 .jsp떼고 나머지만 넣는다. 위와 결과는 동일
			mv.addObject("data", "hell로 world");
			
			return mv; //controller에서는 뷰에대한 정보 and 데이터에 정보를 반환
			
		} else if (path.equals("/test/bbb")) {
			System.out.println("bbb 메서드");
		}






		return null;
	}



}

