package com.dailypractise;

public class Constructor2 {
	int id;
	String name;
	Constructor2(int id,String name)
	{
		this.name=name;
		this.id=id;
		System.out.println("Constructor called: "+id+" "+name);
	}
	public static void main(String[] args) {
		Constructor2 c1=new Constructor2(1,"Sanskruti");
		
		Constructor2 c2=new Constructor2(2,"Duggi");
		
		Constructor2 c3=new Constructor2(3,"Janu");
		
		Constructor2 c4=new Constructor2(4,"Aaru");
		
		
	}

}
