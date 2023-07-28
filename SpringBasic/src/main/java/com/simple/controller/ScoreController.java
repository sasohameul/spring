package com.simple.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.simple.command.ScoreVO;
import com.simple.service.ScoreService;

@Controller
@RequestMapping("/service")
public class ScoreController {

	//1st 부모클래스의 메서드를 먼저 실행하기위해 자식생성,부모에 저장 //멤버변수로 선언
	//ScoreService service = new ScoreServiceImpl(); //스프링이 원하는 방법이 아님
	
	//2nd - 직접 빈 등록, 자동주입
//	@Autowired
//	ScoreService service;
	
	//3rd (ScoreServiceImpl.java 클래스 위에 Service annotation 선언)
	@Autowired
	@Qualifier("scoreService")
	ScoreService scoreService;
	
	//등록 화면 처리
	@RequestMapping("/scoreRegist")
	public String regist() {

		return "service/scoreRegist";
	}

	//목록 화면 처리
	@RequestMapping("/scoreList")
	public String scoreList(Model model) {

		ArrayList<ScoreVO>list = scoreService.getScore(); 
		model.addAttribute("list",list);
		System.out.println(list);
		
		return "service/scoreList"; //forward방식으로
	}

	//결과 화면 처리
	@RequestMapping("/scoreResult")
	public String scoreResult() {

		return "service/scoreResult";
	}

	//등록 요청
	@RequestMapping(value="/scoreForm", method=RequestMethod.POST)
	public String scoreForm(ScoreVO vo) {

		scoreService.scoreRegist(vo);

		return "redirect:/service/scoreResult";
	}

	//삭제요청
	@RequestMapping("/scoreDelete")
	public String scoreDelete(@RequestParam("num") int index){
		
		scoreService.scoreDelete(index);
		
		return "redirect:/service/scoreList"; //삭제 이후에는 목록으로
	}




}
