package com.dailypractise;
import java.util.*;
public class SwapNum {
int num2,temp;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		int num1=sc.nextInt();
		System.out.println("Enter second number");
		int num2=sc.nextInt();
		int temp=num1;
		num1=num2;
		num2=temp;
		temp=num1;
		System.out.println("First number after swapping:"+num1);
		//System.out.println(temp);
		System.out.println("Second number after swaping:"+num2);
	}

}
