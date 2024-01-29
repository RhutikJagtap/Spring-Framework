package com.springcore.di;

//Program for Setter Injection
public class Student1 {
	
	private int id;
	private String studentName;
	

	public void setId(int id) {
		this.id = id;
		System.out.println("Setter method Called....:setId");
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
		System.out.println("Setter method Called....:setName");
	}


	public void displayStudentInfo()
	{
		System.out.println("Student Id is :"+id);
		System.out.println("Student name is :"+studentName);
	}

}
