package ex06;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	
	public static void main(String[] args) {
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("automobile-context.xml");
		
		Airplane ap = ctx.getBean(Airplane.class);
		Car a = ctx.getBean(Car.class);
		
		ap.getBattery().energy();
		a.getBattery().energy();
		
		
		
		
		
		
		
		
	}
	
	
	

}
