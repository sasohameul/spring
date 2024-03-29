package com.simple.command;

public class ScoreVO {

	private String name;
	private String kor;
	private String eng;
	private int num;
	
	private String id;
	private String addr;
	
	public ScoreVO() {

	}

	public ScoreVO(int num, String name, String kor, String eng) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.num = num;
	}

	
	
	
	@Override
	public String toString() {
		return "ScoreVO [name=" + name + ", kor=" + kor + ", eng=" + eng + ", num=" + num + ", id=" + id + ", addr="
				+ addr + "]";
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getKor() {
		return kor;
	}

	public void setKor(String kor) {
		this.kor = kor;
	}

	public String getEng() {
		return eng;
	}

	public void setEng(String eng) {
		this.eng = eng;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	
	
	
	
}
