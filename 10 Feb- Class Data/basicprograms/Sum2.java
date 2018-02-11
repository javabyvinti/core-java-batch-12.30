package com.java.basicprograms;

public class Sum2 {

	public static void main(String[] args) {
		// inheritance
		// object
		
		Sum s = new Sum();
		Student student = new Student();
		
		student.setRollno(90);
		System.out.println(student.getRollno());
				// 900 + 5
		s.value = s.value + 5;
		System.out.println(s.value);
		s.print();
	}

}
