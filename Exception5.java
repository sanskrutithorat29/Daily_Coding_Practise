package com.dailypractise;

public class Exception5 {
//ways to print description
	public static void main(String[] args) {
		try {
			System.out.println(100/0);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("-------------------------------------");
			System.out.println(e);
			System.out.println(e.toString());
			System.out.println("-------------------------------------");
			System.out.println(e.getMessage());

		}

	}

}
