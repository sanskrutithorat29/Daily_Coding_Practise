package com.dailypractise;
import java.util.*;
public class MaxMinNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		int num1=sc.nextInt();
		System.out.println("Enter second number");
		int num2=sc.nextInt();
		if(num1>num2)
		{
			System.out.println(num1+" "+"is greater number");
			System.out.println(num2+" "+"is smaller number");
		}
		else if(num1==num2)
		{
			System.out.println("Equal numbers");
		}
		else
		{
			System.out.println(num2+" "+"is greater number");
			System.out.println(num1+" "+"is smaller number");

		}
	}

}
