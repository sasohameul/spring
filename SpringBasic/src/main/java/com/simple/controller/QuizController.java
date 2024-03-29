package com.simple.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.simple.command.QuizVO;

@Controller
@RequestMapping("/quiz")
public class QuizController {

	@RequestMapping("/quiz01")
	public void quiz01() {
		
	}
	
	@RequestMapping("/quiz01_ok")
	public String birth(@ModelAttribute ("year") String year,
						@ModelAttribute ("month") String month, 
						@ModelAttribute ("day") String day) {
		
		
		
		return "quiz/quiz01_ok";
	}
	
	@RequestMapping("/quiz02")
	public void quiz02() {
		
		
	}
	
	@RequestMapping("/join")
	public String join(@ModelAttribute("result") QuizVO vo) {
		
		
		return "/quiz/quiz02_ok";
	}
	
	@RequestMapping("/quiz03")
	public void quiz03() {
		
		
	}
	
	@RequestMapping(value="/join2", method=RequestMethod.POST)
	public String join2 (@ModelAttribute("id")String id,
						 @ModelAttribute("pw")String pw,
						 @ModelAttribute("pw_check") String check,
						 RedirectAttributes ra) {
		
		if(id.equals("")) {
			
			ra.addFlashAttribute("msg","<script> alert('아이디를 입력하세요')</script>");
			
			return "redirect:/quiz/quiz03";
			
		} else if (!pw.equals(check)) {
			
			ra.addFlashAttribute("msg", "<script> alert('비밀번호가 일치하지않습니다.')</script>");
			
			return "redirect:/quiz/quiz03";
			
		} else {
			
			return "quiz/quiz03_ok";
			
		}
		
		
		
	}
	
	
	
}
