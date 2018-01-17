package com.java.basicprograms;

import java.util.Scanner;

public class FirstFile {

	public static void main(String[] args) {

		// method for data input --> int
		// nextInt() --> int input
		// nextFloat() --> float input
		//nextLong() --> long input
		// short, double, byte, etc.
		// next() --> for String --> without whitespace or before whitespace
		// nextLine() --> for String --> sentance work with whitespaces before new line(\n)
		Scanner scanner = new Scanner(System.in);
		
		// Decision making
		System.out.println("Enter your first value");
		int value1 = scanner.nextInt();
		System.out.println("Enter your second value");
		int value2 = scanner.nextInt();
		System.out.println("Enter your third value");
		int value3 = scanner.nextInt();
	
		System.out.println("Enter your name");
		scanner.nextLine();
		String name = scanner.nextLine();
		System.out.println("User name is = " +name);
		//Scanner --> Predefined class for user input
		
		
		//value1
		if(value1 > value2 && value1 > value3)
		{
			System.out.println("value1 is greater");
		}//value2
		else if(value2>value3){
			System.out.println("value2 is greater");
		} else
			System.out.println("value3 is greater");
	}
}