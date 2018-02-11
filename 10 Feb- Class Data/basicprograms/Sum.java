package com.java.basicprograms;

public class Sum {
	//state --> 
	//instance variable --> declared outside of any method,
	// 						or constructor or block, etc
	//global variable
	
	int value =  900;	//0	primitive type
	float f;	// 0.0f
	double d; // 0.0d
	long l; //0l
	String n; // (\0)	--> null
	boolean b;
	char c;
	
	// instance variable come with default value
	
	void print(){
		System.out.println("Printing some value");
	}
			
	public static void main(String[] args) {
		
		int val = 10;// primitive type

		Sum sum = new Sum();
		System.out.println(sum.c);
		System.out.println(sum.value + val);
		
		System.out.println(val);
		System.out.println(sum.value);
		System.out.println(sum.n);
		System.out.println(sum.b);
	}
	
}
