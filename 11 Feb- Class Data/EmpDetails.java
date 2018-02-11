package com.java.basicprograms;

public class EmpDetails {

	// this --> variable and constructors
	
	String companyName;
	String empName;	// 
	int empCode; //
	float empSalary;
	
	//multiple constructor calling using single object --> use this()
	
	EmpDetails(){
		companyName = "ABC Pvt. Ltd.";
	}
	// constructor chaining
	EmpDetails(String empName, int empCode){
		this(40000.3f);
		this.empName = empName;
		this.empCode = empCode;
	}
	
	EmpDetails(float empSalary){
		this();
		this.empSalary = empSalary;
	}
	
	void output(){
		System.out.println("Company Name = " +companyName);
		System.out.println("Employee Name = " +empName);
		System.out.println("Employee Code = " +empCode);
		System.out.println("Employee Salary = "+empSalary);
	}
	
	public static void main(String[] args) {
		
		EmpDetails ram = new EmpDetails("Ram", 1001);
		ram.output();
	}
}