package com.java.basicprograms;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a number");
		
		int userNumber = scanner.nextInt();
		
		for(int value = 1; value<=10; value++){
			
			System.out.println(userNumber*value);
			
			//System.out.println(userNumber + " X " + value + " = " + userNumber*value);
			
		}
		

	}

}
