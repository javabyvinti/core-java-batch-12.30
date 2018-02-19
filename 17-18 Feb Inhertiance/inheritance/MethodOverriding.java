package com.java.inheritance;


class University{
	
	String course;
	String name;
	String address;
	long phnNo;
	
	int value = 10;
	
	void input(){
		System.out.println("Input of University class" + this.value);
	}
	
	void output(){
		System.out.println("Output of University class");
	}
}


class BPT extends University{
	
	int value = 20;
	
	void resultCalculation(){
		System.out.println("Result Calculated");
	}
	// Overriding --> annotations -->for Developers , compiler -- ignore 
	// Overriding --> 
	
	@Override
	void input(){
		// this --> always point to the current class
		// super --> always point to the parent class
		// when name defined in child class is same as the one defined 
		// in parent class then use super keyword for accessing the 
		// features of parent class
		// Parent Features --> Use this Feature with Modification
		// Logic changed --> Overriding
		// Requirement Changed --> Overloading 
		super.input();
		System.out.println("Input of BPT College class" + value + super.value + course);
	}
}

public class MethodOverriding {

	// MethodOverriding --> signature--> 
	// void print(int value){...}

	// Return type, method name and no. of arguments all must be same
	// MethodOverriding --> Inheritance is mandatory
	public static void main(String[] args) {
		
		BPT bpt = new BPT();
		bpt.input();

	}

}
