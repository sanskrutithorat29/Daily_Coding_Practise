package com.dailypractise;
import java.util.*;
public class Exception4 {
//  Write a program that divides
//	two numbers input by the user.
//	Use a try-catch block to handle the case
//	where the divisor is zero.


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		try {
			
			int op=num1/num2;
			System.out.println("The output is: "+op);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Divide by 0 not allowed");
		}
	}

}
