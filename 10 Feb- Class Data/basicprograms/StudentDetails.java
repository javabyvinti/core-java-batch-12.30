package com.java.basicprograms;

import java.util.Scanner;

public class StudentDetails {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int rollno = scanner.nextInt();
		
		Student student = new Student();
		student.setRollno(rollno);
		
		if(rollno>0){

			System.out.println("Rollno is = " +student.getRollno());	
		}
	}

}
