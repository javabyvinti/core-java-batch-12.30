package com.java.basicprograms;

import java.util.Scanner;

public class SwitchDemo2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your day");
		
		String day = scanner.next().toLowerCase();
		
		switch(day){
			
		case "monday":
			System.out.println("2% discount");
			break;

		case "tuesday":
			System.out.println("3% discount");
			break;
			
		case "wednesday":
			System.out.println("4% discount");
			break;
			
		case "thursday":
			System.out.println("5% discount");
			break;
			
		case "friday":
			System.out.println("6% discount");
			break;
			
		case "saturday":
			System.out.println("7% discount");
			break;
			
		case "sunday":
			System.out.println("8% discount");
			break;
		default:
			System.out.println("Only Days between [Monday-Sunday] are allowed");
		}
		

	}

}
