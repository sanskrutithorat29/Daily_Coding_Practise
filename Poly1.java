package com.dailypractise;

public class Poly1 {
	public void add(int a,int b)
	{
		System.out.println("2 num add: "+(a+b));
	}
	public void add(int a, int b, int c)
	{
		System.out.println("3 num add: "+(a+b+c));
	}
	
	public static void main(String[] args) {
		Poly1 p1=new Poly1();
		p1.add(20, 30);
		p1.add(10, 20, 30);
	}

}
