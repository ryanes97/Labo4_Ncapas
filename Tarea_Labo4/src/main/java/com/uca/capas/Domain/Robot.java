package com.uca.capas.Domain;

import javax.validation.constraints.AssertTrue;

public class Robot {
	
	@AssertTrue(message="UPS eres un Robot :(, regresa")
	private Boolean soyRobot;

	public Boolean getSoyRobot() {
		return soyRobot;
	}

	public void setSoyRobot(Boolean soyRobot) {
		this.soyRobot = soyRobot;
	}
	
	
}
