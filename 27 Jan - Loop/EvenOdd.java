package com.java.basicprograms;

public class EvenOdd {

	public static void main(String[] args) {
		// Total even and odd no. between 1-100
		
		int even = 0, odd = 0;
		
		for(int i = 1; i <= 100; i++){
			if(i%2==0){
				even++;
				System.out.println("Even  = " + i);
			}else{
				odd++;
				System.out.println("Odd  = " + i);
			}
			
		}
		
		System.out.println("Total Even No's are = " + even);
		System.out.println("Total Odd No's are = " + odd);

	}

}
