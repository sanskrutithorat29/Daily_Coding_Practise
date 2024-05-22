package com.dailypractise;
import java.util.*;
public class userAdd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
//		int sum=0;
//		for(int i=1;i<=num;i++)
//		{
//			sum=sum+i;
//			System.out.println(sum);
//		}
		
		int multi=1;
		for(int i=1;i<=num;i++)
		{
			multi=multi*i;
			System.out.print(i+"*");
						
		}
		System.out.print("="+multi);

	}
//1*2*3=6

}