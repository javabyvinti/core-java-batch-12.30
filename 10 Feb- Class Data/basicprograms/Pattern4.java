package com.java.basicprograms;

public class Pattern4 {

	/*
	     *
	    **
	   *** 
	  ****
	 *****
	 
	 */

	public static void main(String[] args) {
			
		for(int row = 1; row<=5; row++)// row=2<=5
		{	
			for(int space = 5; space>=row; space--){
				System.out.print(" ");// 5>=2
			}	
			for(int column = 1; column<=row; column++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}

}
