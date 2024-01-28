package com.springcore.ioc;

public class Airtel implements Sim {

	@Override
	public void calling() {

		System.out.println("calling using Airtel Sim");
	}

	@Override
	public void data() {
		System.out.println("Browsing internet using Airtel Sim");
	}

}
