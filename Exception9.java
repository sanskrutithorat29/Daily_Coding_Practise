package com.dailypractise;

public class Exception9 {

	public static void main(String[] args) {
		
		
			Exception9 e9=new Exception9();
			e9.divide();
	}
	public void divide() {
		try {
			System.out.println(100/0);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
