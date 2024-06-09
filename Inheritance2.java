package com.dailypractise;

class X{
	public void showA()
	{
		System.out.println("This is A");
	}
}

class Y extends X{
	public void showB()
	{
		System.out.println("This is B");
	}
}

class Z extends Y{
	public void showC()
	{
		System.out.println("This is C");
	}
}
class Inheritance2 {

	public static void main(String[] args) {
		X a1=new X();
		a1.showA();
		System.out.println("-------------------------------------------");
		Y b1=new Y();
		b1.showA();
		b1.showB();
		System.out.println("-------------------------------------------");
		Z c1=new Z();
		c1.showA();
		c1.showB();
		c1.showC();

	}

}
