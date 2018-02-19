package com.java.inheritance;

// Object class is root of all the classes
class A extends Object{
	int value = 10;
	
	A(){
		super();
		System.out.println("Default of A class");
	}
}


class B extends A{
	int value = 20;
	
	B(){
		super();
		System.out.println("Default of B class");
	}
	
	B(int value){
		System.out.println("Param cons of B class = " +this.value);
	}
	
}

class C extends B{
	int value = 30;
	
	C(){
		super(67);// parent class constructor calling
		// overload
		System.out.println("Default of C class");
	}
	
	void print(int value){ // 5 + 30 + 20 + 10 = 65
		// value = value +  C class value + B class value + A class value
		System.out.println(value);// 65
	}
}

public class MethodOverriding2 {

	public static void main(String[] args) {
		C obj = new C();
		obj.print(5);
	}
}