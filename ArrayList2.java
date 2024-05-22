package com.dailypractise;
import java.util.ArrayList;
public class ArrayList2 {
	public static void main(String args[])
	{
		ArrayList al=new ArrayList();
		al.add(1);
		al.add(2);
		al.add(1);
		System.out.println(al.contains(1));
		
		ArrayList a2=new ArrayList(al);
		System.out.println(a2.contains(1));

		
	}
}
