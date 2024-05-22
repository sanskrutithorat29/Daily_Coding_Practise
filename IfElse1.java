//to find positive,negative and zero 
package com.dailypractise;
import java.util.*;
public class IfElse1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		if(num>0)
		{
			System.out.println("Positive number");
		}
		else if(num==0)
		{
			System.out.println("Zero");
		}
		else
		{
			System.out.println("Negative number");
		}
		
	}

}
