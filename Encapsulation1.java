package com.dailypractise;

class Encapsulation1 {
	private String name;
	
	public String getName()
	{
		return this.name;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public static void main(String args[])
	{
		Encapsulation1 e1=new Encapsulation1();
		e1.setName("Sanskruti");
		System.out.println(e1.getName());
		
		Encapsulation1 e2=new Encapsulation1();
		e2.setName("Thorat");
		System.out.println(e2.getName());
	}
}
