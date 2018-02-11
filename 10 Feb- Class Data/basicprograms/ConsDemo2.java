package com.java.basicprograms;

public class ConsDemo2 {

	String name;
	int rollno;
	
		
	
//	void input(String n, int r){
//		name = n;
//		rollno = r;
//	}
	
	// this keyword --> always points to the current class
	// help to access the data defined in a class --> constructor,instance variable, methods
	
	ConsDemo2(String name, int rollno){
		this.name = name;
		this.rollno = rollno;
	}
	
	void output(){
		System.out.println("Name is = " +name);
		System.out.println("Rollno is = "+rollno);
	}
	
	
	public static void main(String[] args) {
		ConsDemo2 obj = new ConsDemo2("Ram", 1001);
		//obj.input("Ram", 1001);
		System.out.println(obj.name + " " + obj.rollno);
	}
}
