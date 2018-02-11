package com.java.basicprograms;

public class ConsDemo1 {

	//ConsDemo1(){}	// default cons
	
	// default --> access within same package
	
	public ConsDemo1(){ // default cons
		System.out.println("Default constructor");
	}
	
	// constructor overloading
	ConsDemo1(int value){ // default cons
		System.out.println("Param constructor " +value);
	}
	
	ConsDemo1(float value){ // default cons
		System.out.println("Param constructor " +value);
	}
	
	ConsDemo1(String name){ // default cons
		System.out.println("Param constructor " +name);
	}
	
	ConsDemo1(int value1, int value2){ // default cons
		System.out.println("Param constructor " + value1 + " " + value2);
	}
	
	
	public ConsDemo1(int i, int j, int k) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		ConsDemo1 obj = new ConsDemo1(1, 3, 7);
	}

}
