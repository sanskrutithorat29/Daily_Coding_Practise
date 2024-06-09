package com.dailypractise;

class P{
	public void showP()
	{
		System.out.println("P");
	}
}

class Q extends P{
	public void showQ()
	{
		System.out.println("Q");
	}
}

class R extends P{
	public void showR()
	{
		System.out.println("R");
	}
}

public class Inheritance3 {

	public static void main(String[] args) {
		P p1=new P();
		p1.showP();
		System.out.println("-------------------------------------------");
		Q q1=new Q();
		q1.showP();
		q1.showQ();
		System.out.println("-------------------------------------------");
		R r1=new R();
		r1.showP();
		r1.showR();

	}

}
