package com.simple.service;

import java.util.ArrayList;

import com.simple.command.ScoreVO;
//인터페이스는 연결고리여서 여기서 @Service를 사용할 수 없다. 인터페이스는 객체생성이 안되기때문
public interface ScoreService {

	public void scoreRegist(ScoreVO vo);
	public ArrayList<ScoreVO> getScore();
	public void scoreDelete(int index);
	
	
	
}
