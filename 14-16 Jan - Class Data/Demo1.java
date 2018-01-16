class Demo1{

	public static void main(String args[])
	{
		
		String first = new String("Java");
		String second = new String("World");
		String third = new String("java");
		String fourth = new String("world");

		if(first.equalsIgnoreCase(third))
		{
			System.out.println("Same");
		} else{
			System.out.println("Not Same");
		}

		if(second.equalsIgnoreCase(fourth))
		{
			System.out.println("Same");
		} else{
			System.out.println("Not Same");
		}


	}

}