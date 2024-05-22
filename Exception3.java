package com.dailypractise;
import java.util.*;
public class Exception3 {
//Write a program that asks the user 
//	to input an integer value and then validates
//	the input using a try-catch block. Handle the case where 
//	the user enters a non-integer value.


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter user input: ");
		try {
			int userInput=sc.nextInt();
			System.out.println("You have entered Integer value: "+userInput);
			
		}
		catch(Exception e)
		{
			System.out.println("Not valid input..please enter integer value");
		}

	}

}
