package com.springcore.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
	public static void main(String[] args) {
		//setting value using setter method
//		Student student=new Student();
//		student.setStudentName("Rhutik Jagtap");
//		student.displayStudentInfo();
		
		ApplicationContext context=new ClassPathXmlApplicationContext("beans2.xml");
		System.out.println("beans2.xml loading...");
		
		System.out.println("=====================");
		Student1 student1=context.getBean("stu1",Student1.class);
		student1.displayStudentInfo();
		System.out.println("=====================");
		
		Student1 student2=context.getBean("stu2",Student1.class);
		student2.displayStudentInfo();
		
	}

}
