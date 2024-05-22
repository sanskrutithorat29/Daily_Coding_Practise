//leap year
package com.dailypractise;
import java.util.*;
public class IfElse2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the year :");
		int year=sc.nextInt();
		if(year%4==0)
		{
			System.out.println("Leap year");
		}
		else
		{
			System.out.println("Not an leap year");
		}
	}

}
