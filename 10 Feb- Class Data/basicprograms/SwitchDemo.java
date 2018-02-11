package com.java.basicprograms;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		
		// switch 
		
		// vowel or consonant
		
	
		Scanner scanner = new Scanner(System.in);
							// string
						//0 ,  1,  2,  3, 4
		// char name[] = {'R','a','m', 'k', 'u'}
		String name = "Ram";
		
		char userChoice =  scanner.next().charAt(0);
		// int value = 10 20 30 
		
		// userChoice = 't'
		
		switch(userChoice)// condition --> variable name
		{
		case 'a':	// 'i' == 'a'
		case 'e': // 'i'=='e'
		case 'i': // 'i' == 'i'
		case 'o':
		case 'u':
			System.out.println("Vowel");
			break; // optional
	
		default:
			System.out.println("Consonant");
		break;
	
			
		}
	}

}