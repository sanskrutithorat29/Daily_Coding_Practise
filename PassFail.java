package com.dailypractise;
import java.util.*;
public class PassFail {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your marks");
		int marks=sc.nextInt();
		if(marks>=40)
		{
			System.out.println("Congratulations...you are pass");
		}
		else
		{
			System.out.println("You are fail");
		}
	}
	

}
