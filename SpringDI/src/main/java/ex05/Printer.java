package ex05;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Printer {
	
	
	/*
	 * @Autowired
	 * - 멤버변수, 생성자, setter 모두 사용
	 * - bean중에서 주입될 수 있는 적합한 타입을 찾아서 자동 주입
	 */
	@Autowired
	@Qualifier("document1") //qualifier: 빈의 이름을 강제로 연결해줌 (빈의 타입이 두가지 이상일 때, 어떤 빈에 주입해야할지 정해주어야하므로 qualifier사용)
	private Document document;
	
	//기본 생성자
	public Printer() {

	}
	
	//생성자 주입 ok
	//@Autowired
	public Printer(Document document) {
	
	this.document = document;
	}

	//getter, setter 통한 주입 ok
	public Document getDocument() {
		return document;
	}

	public void setDocument(Document document) {
		this.document = document;
	}
	
	
	
}
