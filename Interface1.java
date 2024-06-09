package com.dailypractise;

interface A{
	void drive();
	void run();
}

class Interface1 implements A{
	public void drive()
	{
		System.out.println("I am driving");
	}
	
	public void run()
	{
		System.out.println("I am running");
		
	}
	
	public static void main(String args[])
	{
		Interface1 i1=new Interface1();
		i1.drive();
		i1.run();
	}
}