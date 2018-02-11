package com.java.basicprograms;

public class Pattern3 {

	/*
	 *****		A
	 ****		AB
	 ***		ABC
	 **			ABCD
	 *			ABCDE
	 */
	
	public static void main(String[] args) {
	
		for(char row = 'A'; row<='E'; row++){
			for(char column = 'A'; column<=row; column++){
				System.out.print(column);
			}
			System.out.println();
		}
		

	}

}
