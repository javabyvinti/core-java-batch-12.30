package com.java.basicprograms;

public class BreakContinue {

	public static void main(String[] args) {
		
		//outer loop
		for(int k =1; k<=5; k++){	// k=1<=5
		
			// inner loop
			for(int i = 1; i<=10; i++){// i=6<=10
				
				if(i==5){
					continue;	// skip the current iteration
					//break;// exit (break the current iteration) from loop
				}else{
					System.out.println(i);
				}
				
			}
		
		}
		

	}

}
