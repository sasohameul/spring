package ex07;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import ex01.SpringTest;
import ex02.Chef;
import ex02.Hotel;
import ex03.DatabaseDev;
import ex03.MemberDAO;

@Configuration
public class JavaConfig {
	
	//<bean id="test" class="ex01.SpringTest"/>와 동일함
	@Bean
	public SpringTest test() {
		return new SpringTest();
	}
	
	@Bean
	public Chef chef() {
		
		return new Chef();
	}
	
	@Bean
	public Hotel hotel() {
		
		return new Hotel(chef());
	}
	
	@Bean
	public DatabaseDev dev() {
		
		DatabaseDev dev = new DatabaseDev();
		dev.setUrl("자바파일로생성");
		dev.setUid("hi");
		dev.setUpw("레오니");
		
		return dev;
		
	}
	
	@Bean
	public MemberDAO memberDAO() {
		
		MemberDAO mDAO = new MemberDAO();
		//mDAO.setDataSource(dev());
		ArrayList<DatabaseDev> list = new ArrayList<DatabaseDev>();
		list.add(dev());
		
		return mDAO;
	}
	
	
	

}
