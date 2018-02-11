package com.java.basicprograms;

public class Pattern2 {
	
	/*
	 
	 1
	 22
	 333
	 4444
	 55555
	 
	 */
	
	public static void main(String[] args) {
		
			for(int row = 1; row <= 5; row++){//2<=5
				for(int column = 1; column <= row; column++)//3<=2
				{
					System.out.print(row);//12
				}
				System.out.println();
			}

	}

}
