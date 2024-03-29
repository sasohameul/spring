package com.simple.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.simple.command.ReqVO;

@Controller
@RequestMapping("/response")
public class ResponseController {

	@RequestMapping("/res_ex01")
	public void ex01() {
		
		
	}
	
	//model 방식 전달자 - 일반적으로 사용
	@RequestMapping("/ex02")
	public String ex02(Model model) {
		
		model.addAttribute("name", "홍길동");
		model.addAttribute("date", new Date());
		
		return "response/ex02";
	}
	
	//ModelAndView 방식 - 데이터와 페이지 정보를 동시에 저장하는 객체
	@RequestMapping("/ex03")
	public ModelAndView ex03() {
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("serverTime",new Date()); //데이터
		mv.setViewName("response/ex03"); //괄호 안에는 화면의 정보를 싣는다
		
		return mv;
		
	}
	
	//@ModelAttribute(화면에서 넘어오는 키값)
	@RequestMapping("/ex04")
	public String ex04(@ModelAttribute("id") String id,
						@ModelAttribute("pw") String pw) {
		
		System.out.println("넘어온 값: " + id);
		System.out.println("넘어온 값: " + pw);
	
		
		return "response/ex04";
	}
	
	//ModelAttribute 객체타입 vo받아서 xxx이름으로 변경해서 화면으로 전달
	@RequestMapping("/ex05")
//	xxx라고 화면이름을 정하고 값을 넘긴다.
	public String ex05(@ModelAttribute("xxx") ReqVO vo) {
		
		System.out.println(vo.toString());
			
		return "response/ex05";
	}
	
	////////////////////////////////////////////////////
	////리다이렉션과 리다이렉션어트리뷰트
	
	//화면띄우기
	@RequestMapping("/join")
	public String join() {
		
		return "response/join";
	}
	
	//form요청
	@RequestMapping(value="/joinForm", method=RequestMethod.POST)
	public String joinForm(ReqVO vo, RedirectAttributes ra) {
		
		//가입처리 했다는 가정하에
		//리다이렉트시에 사용, 딱 1회성으로 데이터를 화면에 전달해준다.(새로고침하면 값이 사라진다.)
		//리다이렉트시에 모델은 사용할 수 없다.
		                       //키  , 값
		ra.addFlashAttribute("msg","정상처리되었습니다.");
		return "redirect:/"; //redirect:/주소(절대경로)
		
	}
	
	//////////////////////////////////////////////////////
	/////
	
	@RequestMapping("/res_quiz01")
	public String quiz() {
		
		return "response/res_quiz01";
	}
	
	
	//내 답 
//	@RequestMapping(value="/loginForm", method=RequestMethod.POST)
//	public String res_login(@ModelAttribute ("id") String id,
//							@ModelAttribute ("pw") String pw,
//							RedirectAttributes ra ){
//		
//		if(id.equals("kim12") && pw.equals("1234")) {
//			
//			return "response/res_quiz02";
//		
//		} else {
//			
//			
//			ra.addFlashAttribute("msg", "<script>alert('로그인실패')</script>");
//			
//			return "redirect:/response/res_quiz01";
//			
//		}
//		
//		
//	}
//	
	
	//데이터 갖고 나갈게 없다면 redirect
	
	//쌤
	@RequestMapping("/res_login")
	public String res_login(@RequestParam("id") String id,
							@RequestParam("pw") String pw, 
							Model model, 
							RedirectAttributes ra) {
		
		
		if(id.equals("kim12") && pw.equals("")) {
			
			model.addAttribute("id",id); //forward 모델 사용
			
			return "response/res_quiz02";
			
		} else {
			
			ra.addFlashAttribute("msg","아이디 비밀번호를 확인하세요");
			return "redirect:/response/res_quiz01";
		}
		
		
	}
	
	
	
}
