//max of 3 numbers
package com.dailypractise;
import java.util.*;
public class IfElse3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		int num1=sc.nextInt();
		System.out.println("Enter second number:");
		int num2=sc.nextInt();
		System.out.println("Enter third number");
		int num3=sc.nextInt();
		
		if(num1>num2 && num1>num3)
		{
			System.out.println("1st is max");
		}
		else if(num2>num3 && num2>num1)
		{
			System.out.println("2nd is max");
		}
		else
		{
			System.out.println("3rd is max");
		}
	}

}
