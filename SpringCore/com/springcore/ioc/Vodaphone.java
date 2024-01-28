package com.springcore.ioc;

public class Vodaphone implements Sim {

	
	public Vodaphone() {
		System.out.println("Constructor of Vodaphone class");
	}

	@Override
	public void calling() {

		System.out.println("calling using Vodaphone Sim");
	}

	@Override
	public void data() {
		System.out.println("Browsing internet using Vodaphone Sim");
	}

}
