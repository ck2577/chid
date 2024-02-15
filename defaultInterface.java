package com.chid.utility;

interface defaultinter
{
	default void add() {
		System.out.println("interface add method");
	}
	default void subtract()
	{
		System.out.println("interfcae subtract method");
	}
	static void multiply()
	{
		System.out.println("interface multiply methoddd");
	}
}

public class defaultInterface implements defaultinter{
	public static void main(String ar[])
			{
				defaultInterface obj = new defaultInterface();
				obj.add();
				obj.subtract();
				defaultinter.multiply();
						
				
			}

	
}
