package com.dailypractise;
import java.util.*;
public class ifElse5 {
	/*
	 * Write a Java program that takes three numbers from the user and prints the
	 * greatest number.
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 3 numbers: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a>b && a>c)
		{
			System.out.println("First number is greatest");
		}
		else if(b>a && b>c)
		{
			System.out.println("Second number is gretest");
		}
		else
		{
			System.out.println("Third number is greatest");
		}
	}

}
