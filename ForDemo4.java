//Print Even Numbers between 1 and 20:
package com.dailypractise;
import java.util.*;
public class ForDemo4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		System.out.println("The even numbers are:");
		for(int i=1;i<=num;i++)
		{
			if(i%2==0)
				System.out.println(i);
		}
	}

}
