package com.springcore.ioc;

public class Jio implements Sim {

	
	
	public Jio() {
		System.out.println("Constructor of Jio class");
	}

	@Override
	public void calling() {

		System.out.println("calling using Jio Sim");
	}

	@Override
	public void data() {
		System.out.println("Browsing internet using Jio Sim");
	}

}
