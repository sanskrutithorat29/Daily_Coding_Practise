package com.dailypractise;

interface P{
	void run();
	void clap();
}

interface Q{
	void run();
	void clap();
}


public class Interface2 implements P,Q{
	public void run() {
		System.out.println("I am running");
	}
	
	public void clap() {
		System.out.println("I am clapping");
	}
	
	public static void main(String[] args) {
		Interface2 i2=new Interface2();
		i2.clap();
		i2.run();

	}

}
