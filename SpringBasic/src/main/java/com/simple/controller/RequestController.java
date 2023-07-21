package com.simple.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.simple.command.ReqVO;

@Controller
@RequestMapping("/request")//각 메서드의 공통분모
public class RequestController {

	@RequestMapping("/req_ex01") //리퀘스트컨트롤러 클래스 위 requestMapping에 /request로 매핑하면 이 메서드의 주소맵핑은 request/req_ex01가 된다.
	public String ex01() {
		
		
		return "request/req_ex01";
	}
	//mothod=RequestMethod.Get => get요청만 허용한다는 의미
	//@RequestMapping(value = "/basic1", method = RequestMethod.GET)
	@GetMapping("/basic1")
	public String basic1() {
		
		System.out.println("basic요청");
		
		return "request/basic1";
	}
	
	//post요청만 허용
	//@RequestMapping(value = "/basic2", method = RequestMethod.POST)
	@PostMapping("/basic2")
	public String basic2() {
		
		System.out.println("basic2요청");
		
		return "request/basic2";
	}
	
	//get,post 둘 다 허용
	@RequestMapping("/basic3")
	public String basic3() {
		
		System.out.println("basic3요청");
		
		return "request/basic3";
	}
	
	//////////////////////////////////////////////////
	////////파라미터 값 받기 /////////////////
	@RequestMapping("/req_ex02")
	public String ex02() {
		
		return "request/req_ex02";
		
	}
	
	//전통적인 방법
//	@RequestMapping("/param1")
//	public String param1 ( HttpServletRequest request ) {
//		
//		String name = request.getParameter("name");
//		String age = request.getParameter("age");
//		String[] inter = request.getParameterValues("inter");;
//		
//		System.out.println(name);
//		
//		return "request/result"; //result 페이지로
//	}
//	
	//@RequestParam(req_ex02.jsp의 input태그 네임값) - RequestParam은 값이 필수로 전달되어야 에러가 안뜸
	//그래서 공백을 허용하는 required= false 
	//defaultValue : 값이 없을 때 기본값 지정
	//이 둘을 추가로 넣어주어야공백값이 넘어와도 에러가 안뜸
//	@RequestMapping("/param1") 
//	public String param1 (@RequestParam("name") String x,
//						  @RequestParam( value = "age", required = false, defaultValue = "0") int y,
//						  @RequestParam( value= "inter", required = false, defaultValue= "") ArrayList<String> z) {
//		
//		System.out.println(x);
//		System.out.println(y);
//		System.out.println(z.toString());
//		
//		return "request/result"; //result 페이지로
//	}
	
	//커맨드객체를 이용하는 방법 - 폼태그의 값을받아 처리할 수 있는 class 생성
	@RequestMapping("/param1") 
	public String param1 (ReqVO vo) {

		System.out.println(vo.toString());
		
		return "request/result"; //result 페이지로
	}
	
	@RequestMapping("/req_quiz01")
	public String quiz01 () {
		
		
		return "/request/req_quiz01";
		
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String login(@RequestParam("id") String i,
						@RequestParam("pw") String p) {
		
		
		return i.equals("abc123") && p.equals("xxx123")? "/request/req_quiz01_ok" : "/request/req_quiz01_no";
	}
	
	
	
	
	
}