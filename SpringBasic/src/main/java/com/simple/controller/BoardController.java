package com.simple.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.simple.command.BoardVO;
import com.simple.service.BoardService;

@Controller
@RequestMapping("/service")
public class BoardController {
	
	@Autowired
	@Qualifier("boardService")
	BoardService boardService;

	@RequestMapping("/boardRegister")
	public String Register() {
		
		return "service/boardRegister";
	}
	
	@RequestMapping("/boardList")
	public String List(Model model) {
		
		ArrayList<BoardVO> list = boardService.getList();
		model.addAttribute("list", list);
		System.out.println(list);
		return "service/boardList";
	}

	@RequestMapping("/boardResult")
	public String result() {
		
		return "service/boardResult";
	}
	
	@RequestMapping(value="boardForm", method=RequestMethod.POST)
	public String Form(BoardVO vo) {
		//System.out.println(vo.toString());
		
		boardService.boardRegist(vo);
		return "redirect:/service/boardResult";
	}
	
	@RequestMapping("/boardDelete")
	public String boardDelete(@RequestParam("num") int num) {
		
		boardService.boardDelete(num);
		return "redirect:/service/boardList";
		
	}
	
}
