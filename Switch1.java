package com.dailypractise;
import java.util.*;
public class Switch1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("Enter the operation: ");
		String str=sc.next();
		switch(str)
		{
		case "Add":
			System.out.println("Addition: "+(a+b));
			break;
		case "Sub":
			System.out.println("Substraction: "+(a-b));
			break;
		case "Multi":
			System.out.println("Multiplication: "+(a*b));
			break;
		case "Div":
			System.out.println("Division: "+(a/b));
			break;
		default:
			System.out.println("Default");
		}
	}

}
