package com.simple.command;

import java.util.ArrayList;

public class ReqVO {
	
	//만드는 규칙 - VO와 동일하게 만듭니다.
	//변수명을 form값의 name과 동일한 변수를 멤버변수로 선언
	
	private String name;
	private String age; //int형으로 받는 것보다 String으로 받는 게 안전,편리.
	private ArrayList<String> inter; //check 박스
	
	//기본 생성자 필수
	public ReqVO() {

	}

	public ReqVO(String name, String age, ArrayList<String> inter) {
		super();
		this.name = name;
		this.age = age;
		this.inter = inter;
	}

	//값에 대한 확인을 빠르게하기위해 메소드 오버라이드 alt+shift+s의 generate toString.
	@Override
	public String toString() {
		return "ReqVO [name=" + name + ", age=" + age + ", inter=" + inter + "]";
	}

	//getter, setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public ArrayList<String> getInter() {
		return inter;
	}

	public void setInter(ArrayList<String> inter) {
		this.inter = inter;
	}
	
	
	
	
}
