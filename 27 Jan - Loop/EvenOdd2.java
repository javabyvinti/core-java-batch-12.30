package com.java.basicprograms;

import java.util.Scanner;

public class EvenOdd2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your value");
		int userValue = scanner.nextInt();
		
		if(userValue%2==0) 
			System.out.println("Even"); 
		else 
			System.out.println("Odd");
		

	}

}
