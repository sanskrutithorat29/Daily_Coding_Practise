package com.dailypractise;
import java.util.*;
public class Array4 {
//take input elements from user
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many elements you wants to insert: ");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter "+n+" elements");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("The elements are: ");
		for(int j:a)
		{
			System.out.print(j+ " ");
		}
}
}
