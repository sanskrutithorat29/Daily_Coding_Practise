package com.dailypractise;

import java.util.TreeSet;

public class TreeSet1 {

	public static void main(String[] args) {
		TreeSet ts=new TreeSet();
//		ts.add(1);
//		ts.add(2);
//		ts.add(39);
//		ts.add(12);
//		System.out.println(ts.contains(1));
//		System.out.println(ts);
		ts.add("Sanskruti");
		ts.add("heyy");
		//ts.add(null);
		ts.add("Sanskruti");
//		ts.clear();
		ts.remove("heyy");
		System.out.println(ts);
	}

}
