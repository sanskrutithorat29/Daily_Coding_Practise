package com.dailypractise;

public class Exception7 {

	public static void main(String[] args) {
		try {
			int c=100/0;
			System.out.println("I am try");
		}
		catch(ArithmeticException e)
		{
			System.out.println("I am catch");
		}
		finally {
			System.out.println("I am finally");
		}
		System.out.println("Heyy");
	}

}
