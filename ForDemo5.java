//Generate Multiplication Table
package com.dailypractise;
import java.util.*;
public class ForDemo5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		int multi;
		for(int i=1;i<=10;i++)
		{
			multi=num*i;
			System.out.println(multi);
		}
	}

}
