package com.simple.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simple.command.ScoreVO;
import com.simple.mapper.ScoreMapper;
//@Service("이름") -> controller의 @Qualifier("이름")으로 연결해준다. 
//이름은 멤버변수명 소문자(카멜)로 보통 들어감
@Service("scoreService") //컴포넌트 스캔에 읽히면 자동으로 빈으로 등록
public class ScoreServiceImpl implements ScoreService {
	
	@Autowired
	ScoreMapper scoreMapper;
	
	@Override
	public void scoreRegist(ScoreVO vo) {
	
		scoreMapper.scoreRegist(vo);
		
	}

	@Override
	public ArrayList<ScoreVO> getScore() {
		
		return scoreMapper.getScore();
		
	}

	@Override
	public void scoreDelete(int index) {
		
		scoreMapper.scoreDelete(index);
		
	}
	
	
	
	
	
	
	
	
	
	
	

//	//DAO영역
//	@Autowired
//	@Qualifier("scoreDAO")
//	ScoreDAO scoreDAO;
//	
//	@Override
//	public void scoreRegist(ScoreVO vo) {
//
//		scoreDAO.scoreRegist(vo);
//		
//	}
//
//	@Override
//	public ArrayList<ScoreVO> getScore() {
//
//		//ArrayList<ScoreVO> list = scoreDAO.getScore();
//		return scoreDAO.getScore();
//	}
//
//	@Override
//	public void scoreDelete(int index) {
//		
//		scoreDAO.scoreDelete(index);
//		
//	}

}
