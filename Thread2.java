package com.dailypractise;

public class Thread2 implements Runnable {
	
	//runnable interface                      
	public void run() {
		System.out.println("Run method");
	}

	public static void main(String[] args) {
		Thread2 t2 = new Thread2();
		Thread t = new Thread(t2);
		t.start();
	}

}
