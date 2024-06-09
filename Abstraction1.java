package com.dailypractise;


abstract class Bike{
	int no_of_tyres=4;
	 abstract void start();
}

class R15 extends Bike{
	void start()
	{
		System.out.println("I am R15");
	}
}

class Jawa350 extends Bike{
	void start()
	{
		System.out.println("I am Jawa350");
	}
}
class Abstraction1 {

	public static void main(String[] args) {
		R15 r1=new R15();
		r1.start();

		Jawa350 j1=new Jawa350();
		j1.start();
	}

}
