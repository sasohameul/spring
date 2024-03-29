package ex07;

import java.util.ArrayList;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import ex02.Hotel;
import ex03.DatabaseDev;
import ex03.MemberDAO;

public class MainClass {

	public static void main(String[] args) {
		
		//자바 설정 파일을 읽을 때
		AnnotationConfigApplicationContext atx = 
				new AnnotationConfigApplicationContext(JavaConfig.class);
		
		Hotel hotel = atx.getBean(Hotel.class);
		System.out.println(hotel);
		hotel.getChef().cooking();
		
		DatabaseDev dev = atx.getBean(DatabaseDev.class);
		System.out.println(dev.getUid());
		System.out.println(dev.getUrl());
		System.out.println(dev.getUpw());
		dev.setUid("빈");
		System.out.println(dev.getUid()); 
		
		MemberDAO mDao = atx.getBean(MemberDAO.class);
		System.out.println(mDao.getDataSource().getUid());
		
//		ArrayList<DatabaseDev> list = new ArrayList<DatabaseDev>();
//		list.add(dev);
//		
//		for(DatabaseDev d : list) {
//			
//			System.out.println(d.getUid());
//			System.out.println(d.getUpw());
//			System.out.println(d.getUrl());
//		}
//		
		
		
		
		
		
		
		
		
		
	}
	
}
