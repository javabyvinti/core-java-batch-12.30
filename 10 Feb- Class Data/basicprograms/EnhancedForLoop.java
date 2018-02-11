package com.java.basicprograms;

public class EnhancedForLoop {

	public static void main(String[] args) {
		// Enhanced for loop --> java 1.5 version
		
		int values[] = {43, 65, 54, 32, 87, 32, 76, 65 , 32, 76, 21, 76, 22, 99, 44};
		// 10 
		// 1 to the length of array --> 0-9 --> 1 - 15
		
		System.out.println("Array length is = " +values.length);
		
//		for(int i = 0; i<values.length; i++){
//			System.out.println(values[i]);// values[8]
//		}

		// enhanced for loop
		// array --> elements traverse
		for(int i : values){	// values[15] , values++
			System.out.println(i);	// 43
		}
		
	}

}
