package com.simple.dao;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;
import com.simple.command.ScoreVO;

@Repository("scoreDAO") //컴포넌트 스캔에 읽히면 scoreDAO라는 이름으로 자동으로 빈 등록해줌
public class ScoreDAOImpl implements ScoreDAO{

	//데이터역할이라고 가정
	ArrayList<ScoreVO> list = new ArrayList<>();
	
	@Override
	public void scoreRegist(ScoreVO vo) { 
		list.add(vo);
		System.out.println(list.toString());
	}

	@Override
	public ArrayList<ScoreVO> getScore() {
		System.out.println(list.toString());
		return list;
	}

	@Override
	public void scoreDelete(int index) {
		
		list.remove(index); //삭제
		
	}
	

}
