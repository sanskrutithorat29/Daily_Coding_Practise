package com.dailypractise;

public class Thread1 extends Thread{
	//extends Thread
	public void run() {
		System.out.println("Run method");
	}
	public static void main(String[] args) {
		Thread1 t1=new Thread1();
		t1.start();
	}

}
