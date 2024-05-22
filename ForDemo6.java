//Calculate Average of Numbers
package com.dailypractise;
import java.util.*;
public class ForDemo6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		float num=sc.nextInt();
		float sum=0;
		float avg;
		for(int i=1;i<=num;i++)
		{
			sum=sum+i;
			
		}
		System.out.println("Sum:"+sum);
		avg=sum/num;
		System.out.println("Average:"+avg);
		
	}

}
