package com.springcore.di;

//Program for Constructor Injection
public class Student2 {
	private int id;
	private String studentName;
	
	public Student2(int id)
	{
		this.id=id;
	}
	

	public Student2(int id, String studentName) {
		this.id = id;
		this.studentName = studentName;
		System.out.println("Constructor Injection");
	}
	
	public void displayStudentInfo()
	{
		System.out.println("Student id is :"+id);
		System.out.println("Student Name is :"+studentName);
	}
	
	

}
