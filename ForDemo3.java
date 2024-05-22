//The Program prints the sum of x ranging from 1 to 20
package com.dailypractise;
import java.util.*;
public class ForDemo3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number till which you want sum:");
		int num=sc.nextInt();
		int sum=0;
		for(int i=0;i<=num;i++)
		{
			sum=sum+i;
		}
		System.out.println("The sum is:"+sum);
	}

}
