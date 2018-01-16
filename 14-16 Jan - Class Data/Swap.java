// swap a number

//temp var or without temp var.

class Swap{

	public static void main(String args[])
	{
		// Wrapper Classes --> Wrapper functions
		// Integer, Float, Boolean --> wrapper functions

		System.out.println("Enter your first value");

				// int parseInt(args);
		int value1 = Integer.parseInt(args[0]);

		int value2 = Integer.parseInt(args[1]);

		/* int temp = value1; // 10 temp = 10
		value1 = value2; // 20 value1 = 20
		value2 = temp; */

		value1 = value1 + value2; // 10 + 20 =value1 =  30
		value2 = value1 - value2; // 30 - 20 =value2 =  10
		value1 = value1 - value2; // 30 - 10 = value1 = 20 

		System.out.println("Value1 is = " +value1);
		System.out.println("Value2 is = " +value2);	
	}
}