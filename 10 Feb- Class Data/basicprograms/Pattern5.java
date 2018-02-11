package com.java.basicprograms;

public class Pattern5 {

	/*
	
	 	*				*********
	   ***				 *******
	  *****				  *****
	 *******			   ***
	*********				*
	
	 */
	
	public static void main(String[] args) {
	
		for(int row = 5; row>=1; row--){// row=3<=5
			for(int space = 5; space>=row; space--){
				System.out.print(" ");
			}							// 6-1 = 5
			for(int column = (2*row-1); column >= 1; column--){
				System.out.print("*");
			}
			System.out.println();
		}
		
		
//		for(int row = 1; row<=5; row++){// row=3<=5
//			for(int space = 5; space>=row; space--){
//				System.out.print(" ");
//			}							// 6-1 = 5
//			for(int column = 1; column <= (2*row-1); column++){
//				System.out.print("*");
//			}
//			System.out.println();
//		}

	}

}
