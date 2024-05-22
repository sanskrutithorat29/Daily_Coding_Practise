package com.dailypractise;
import java.util.*;
public class EvenAdd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int sum=0;
		for(int i=0;i<=num;i++)
		{
			if(i%2==0)
			{
				sum=sum+i;
				
			}
			
		}
		System.out.println("The sum is:"+sum);
	}

}
