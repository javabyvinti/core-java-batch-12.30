class Demo2{

	//public available --> 
	//static --> first loaded memory
	// --> no need to create object for main

	//void --> no return type

	// Predefined class --> String
				// java 1.5
	static public void main(String... n){

		// System is predefiend class
		// out is an object of PrintStream
		// println() --> print on the screen
		System.out.println("Java Program");
		System.out.println("Java Program");
		
		// object created
		Demo2 demo2 = new Demo2();		

		demo2.main(54, 21);
		demo2.main(43);
		demo2.main(54l); // by default all non-decimal values are					// considered as Integer

	}
	
	// declare and define 
	void main(int value)
	{
		System.out.println("Integer is called " + value);
	}

	void main(int value, int value2)
	{
		System.out.println(value + " " + value2);
	}

	void main(long value)
	{
		System.out.println("Long is called " +value);
	}

}
// compile --> javac FileName.java
// run --> java ClassName