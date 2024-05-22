package com.dailypractise;

public class Exception10 {
	//throw

	public static void main(String[] args) {
		int age=10;
		if(age<18)
		{
			throw new IllegalArgumentException("Age should be greater than 18");
		}
		else {
			System.out.println("You can vote");
		}
	}

}
