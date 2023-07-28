package com.simple.basic;

import java.util.ArrayList;
import java.util.HashMap;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.simple.basic.mapper.TestMapper;
import com.simple.command.MemberVO;
import com.simple.command.ScoreVO;

@RunWith(SpringJUnit4ClassRunner.class)//JUnit테스트 진행
@ContextConfiguration("file:src/main/webapp/WEB-INF/config/root-context.xml") //테스트를 진행할 스프링 설정파일
public class JDBCMybatis {
	@Autowired
	TestMapper testMapper;
	
//	@Test
//	public void tesetCode01() {
//		
//		int result = testMapper.insertOne("int result = test");
//		
//		System.out.println("성공실패?:" + result);
//	}
	
	
//	@Test
//	public void tesetCode02() {
//		
//		ScoreVO vo = new ScoreVO(0, "test", "100", "90");
//		testMapper.insertTwo(vo);
//	}
//	@Test
//	public void tesetCode03() {
//		
//		HashMap<String, Object> map = new HashMap<String, Object>();
//		map.put("name", "맵을 통한");
//		map.put("kor", "100");
//		map.put("eng", "100");
//		
//		testMapper.insertThree(map);
//
//	}
//	@Test
//	public void tesetCode04() {
//		
//		testMapper.insertFour("파람", "100", "200");
//	}
//	@Test
//	public void tesetCode05() {
//		
//		testMapper.updateOne(new ScoreVO(2, "admin", "100", "100"));
//		
//	}
//	@Test
//	public void tesetCode06() {
//		ScoreVO vo = testMapper.selectOne(2);
//		
//		System.out.println(vo.toString());
//	}
//	@Test
//	public void tesetCode07() {
//		
//		HashMap<String, Object> map = testMapper.selectTwo(2);
//		System.out.println(map.toString());
//	}
//	@Test
//	public void tesetCode08() {
//		
//		ArrayList<HashMap<String, Object>> list = testMapper.selectThree();
//		System.out.println(list.toString());
//	}
//	@Test
//	public void tesetCode09() {
//		
//		ArrayList<ScoreVO> list = testMapper.joinOne();
//		System.out.println(list.toString());
//	}
	@Test
	public void tesetCode10() {
		
		MemberVO vo = testMapper.joinTwo("test");
		System.out.println(vo.toString());
	}

	
	
	
	

}
