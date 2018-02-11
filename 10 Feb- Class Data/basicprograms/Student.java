package com.java.basicprograms;


public class Student {
	
	private String name;
	private int rollno;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		if(rollno>0){
			this.rollno = rollno;	
		}else {
			System.out.println("Rollno cannot be negative");
		}
		
	}
	
	// setters and getters
	// setters --> to set the data
	// getters --> to get the data
	
}
