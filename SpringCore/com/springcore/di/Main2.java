package com.springcore.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main2 {

	public static void main(String[] args) {
		//manually
		//Student2 student2=new Student2(1, "Rj");
		//student2.displayStudentInfo();
		
		ApplicationContext context=new ClassPathXmlApplicationContext("beans3.xml");
		System.out.println("beans3.xml loading..... ");
		
		System.out.println("==================");
		
		Student2 student1=context.getBean("stud1",Student2.class);
		student1.displayStudentInfo();
		
		System.out.println("==================");

		Student2 student2=context.getBean("stud2",Student2.class);
		student2.displayStudentInfo();
		
	}

}
