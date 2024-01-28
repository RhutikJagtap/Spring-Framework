package com.springcore.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {
	public static void main(String[] args) {
		// manually created object
       	//Sim sim =new Vodaphone();
    	//sim.calling();
    	//sim.data();

		//ApplicationContext is a interface
		//ClassPathXmlApplicationContext is implemented class of ApplicationContext interface
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		//here all objects are ready constructor are execute
		System.out.println("config loading..........");

		System.out.println("==========================");
		Sim sim1 = context.getBean("jio", Sim.class);
		sim1.calling();
		sim1.data();
		
		System.out.println("===========================");
		Sim sim2=context.getBean("voda",Sim.class);
		sim2.calling();
		sim2.data();
		
		System.out.println("============================");
		Sim sim3=context.getBean("airtel",Sim.class);
		sim3.calling();
		sim3.data();
		

	}
}
