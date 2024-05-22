package com.dailypractise;
class Parent {
	  void add(int a,int b) {
		System.out.println("Addition Parent: "+(a+b));
	}
}

class Child extends Parent{
	 void add(int a,int b) {
		System.out.println("Addition Child: "+(a+b));
	}
}

public class Poly3 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p1=new Parent();
		p1.add(2, 20);
		
		Child c1=new Child();
		c1.add(2, 203);
	}

}
