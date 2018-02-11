package com.java.basicprograms;

class Person extends Object{
	
	String name;
	long phn;
	
	void input(){
		name = "Ram";
		phn = 9285432215l;
	}
	
	void print(){
		System.out.println(name);
		System.out.println(phn);
	}
}

class Stud extends Person{
	
	String universityName;
	int studId;
	
	void inputStud(String universityName, int studId){
		this.universityName = universityName;
		this.studId = studId;
	}
	
	void outputStud(){
		System.out.println("University Name = " + universityName);
		System.out.println("Student Id = " + studId);
	}
	
	void commonData(){
		System.out.println("Inside Stud");
	}
}

class Emp extends Stud{
	
	void empDetails(){
		name = "Rohan";
		phn = 9754323232l;
		print();
		
	}
	
//	void commonData(){
//		System.out.println("Inside Emp");
//	}
}


public class StudentDemo {

	public static void main(String[] args) {
		Emp obj = new Emp();
		obj.empDetails();
		obj.commonData();
		
	}

}
