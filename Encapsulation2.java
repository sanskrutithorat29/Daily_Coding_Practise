package com.dailypractise;

public class Encapsulation2 {

	private String name;
	private int id;
	
	public String getName()
	{
		return this.name;
	}
	
	public  void setName(String name)
	{
		this.name=name;
	}
	
	
	
	public int getId()
	{
		return this.id;
	}
	public void setId(int id)
	{
		this.id=id;
	}
	
	public static void main(String[] args) {
		Encapsulation2 e2=new Encapsulation2();
		e2.setName("Sanskruti");
		e2.setId(7);
		System.out.println("Name:	"+e2.getName());
		System.out.println("Id:	"+e2.getId());

	}

}
