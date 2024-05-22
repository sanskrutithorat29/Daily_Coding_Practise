package com.dailypractise;

class SingleParent {
	public void add()
	{
		System.out.println("i am addition");
	}
	public void sub()
	{
		System.out.println("i am substraction");
	}
}

class SingleChild extends SingleParent
{
	public void multi()
	{
		System.out.println("i am multiplication");
	}
}


class Test
{
	public static void main(String args[])
	{
		SingleParent s1=new SingleChild();//Parent
		s1.add();
		s1.sub();
		//s1.multi();
		
		SingleChild s2=new SingleChild();//Child
		s2.add();
		s2.sub();
		s2.multi();
	}
}