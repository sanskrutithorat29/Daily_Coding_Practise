package com.dailypractise;

class A{
	public void showA()
	{
		System.out.println("This is A");
	}
}

class B{
	public void showB()
	{
		System.out.println("This is B");
	}
}
class Inheritance1 {

	public static void main(String[] args) {
		A a1=new A();
		a1.showA();
		
		B b1=new B();
		b1.showB();

	}

}
