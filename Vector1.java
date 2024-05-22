package com.dailypractise;
import java.util.*;
public class Vector1 {

	public static void main(String[] args) {

		Vector v=new Vector();
		v.add(10);
		v.add(1, "sanskruti");
		v.addElement(4);
		System.out.println(v);
		System.out.println(v.firstElement());
		System.out.println(v.lastElement());
		System.out.println(v.capacity());
		System.out.println(v.contains(20));
		System.out.println(v);
	}

}
