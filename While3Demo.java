package com.dailypractise;
import java.util.*;
public class While3Demo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int a=sc.nextInt();
		int i=1;
		while(i<=10)
		{
			int multi=a*i;
			System.out.println(a+"*"+i+"="+multi);
			i++;
		}
	}

}
