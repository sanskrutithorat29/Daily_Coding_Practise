package com.dailypractise;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Hashset1 {

	public static void main(String[] args) {
		HashSet hs=new HashSet();
		hs.add(3);//6
		hs.add(4);//10
		hs.add(5);//15
		hs.add(1);//1
		hs.add(2);//3
		hs.add(8);//36
		hs.add(9);//45
		hs.add(10);//55
		hs.add(6);//21
		hs.add(7);//28
		System.out.println("I am hashSet:");
		System.out.println(hs);

		ArrayList al=new ArrayList();
		al.addAll(hs);
		System.out.println("I am arrayList:");
		System.out.println(al);
//		System.out.println(hs);
//		System.out.println(hs.hashCode());
//		System.out.println(hs.contains(2));
//		System.out.println(hs.remove(5));
//		System.out.println(hs.add(5));
//		System.out.println(hs.size());
//		System.out.println("iterator");
//		System.out.println("--------------");
//		Iterator itr=hs.iterator();
//		while(itr.hasNext())
//		{
//			System.out.println(itr.next());
//		}
		
		
		
		
	}

}
