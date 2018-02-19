package com.java.inheritance;

public class MethodOverloading {
	
	public void add(int first, int second){
		System.out.println(first+second);
	}
	
	public void add(int first, int second, int third){
		System.out.println(first+second+third);
	}
	
	public void add(float first, float second){
		System.out.println(first + second);
	}
	
	public long add(long first, long second, long third, long fourth){	
		return first+second+third+fourth;
	}
	
	public static void main(String[] args) {
		MethodOverloading obj = new MethodOverloading();
		obj.add(90, 50);
		obj.add(43, 65, 21);
		System.out.println(obj.add(10,10, 10, 10));
		obj.add(5,8f);
	}
}