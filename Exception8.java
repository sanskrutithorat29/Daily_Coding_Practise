package com.dailypractise;

public class Exception8 {
//do finalize code from here only
	public static void main(String[] args) {
		Exception8 e8=new Exception8();
		e8=null;
		System.gc();
	}
	
	@Override
	protected void finalize() {
		System.out.println("Finalize method");
	}
	 

}
