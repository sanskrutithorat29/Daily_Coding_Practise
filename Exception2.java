package com.dailypractise;

public class Exception2 {

	public static void main(String[] args) {
		
		try {
			System.out.println("2.Executing try block");
			System.out.println(100/0);
			System.out.println("3.Try runned successfully");
		}
		catch(Exception e)
		{
			System.out.println("4.Executing catch block");
		}

	}

}
