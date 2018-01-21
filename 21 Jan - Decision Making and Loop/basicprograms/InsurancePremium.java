package com.java.basicprograms;

import java.util.Scanner;

public class InsurancePremium {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your name");
		
		String name = scanner.nextLine();
		
		System.out.println("Enter your gender[male/female]");
		
		String gender = scanner.next();

		System.out.println("Enter your age");
		
		int age = scanner.nextInt();
		
		System.out.println("Enter your city[metro/non-metro]");
		
		String city = scanner.next();

		if((age>25 && age<35) && gender.equals("male") && city.equals("metro"))
		{
		
			System.out.println("Premium is 6%");
			
		}else if((age>25 && age<40) && gender.equals("male") && city.equals("non-metro"))
		{
		
			System.out.println("Premium is 4%");
			
		} else if((age>25 && age<42) && gender.equals("female") && city.equals("metro"))
		{
		
			System.out.println("Premium is 3%");
			
		}else if((age>25 && age<45) && gender.equals("female") && city.equals("non-metro"))
		{
		
			System.out.println("Premium is 2%");
			
		} else {
			System.out.println("Not insured");
		}
		
		
	}

}





