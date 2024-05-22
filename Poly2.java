package com.dailypractise;
class Parent {
	public void add(int a, int b) {
		System.out.println("Addition parent : "+(a+b));
	}
}
class Child extends Parent{
	public void add(int a,int b)
	{
		System.out.println("Addtion Child: "+(a+b));
	}
}
public class Poly2 {

	public static void main(String[] args) {
		Parent p1=new Child();
		p1.add(20, 20);
		Child c1=new Child();
		c1.add(20, 10);
		Parent p2=new Parent();
		p2.add(30, 60);
	}

}
