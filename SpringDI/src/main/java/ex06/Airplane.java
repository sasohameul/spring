package ex06;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Airplane {

	//batter2 주입해주세요

	@Autowired
	@Qualifier("battery1")
	private IBattery battery;
	
	public Airplane() {
		// TODO Auto-generated constructor stub
	}
	
	public IBattery getBattery() {
		return battery;
	}

	public void setBattery(IBattery battery) {
		this.battery = battery;
	}
	
	
}
