package com.dailypractise;

import java.util.*;

public class Collection1 {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("Sanskruti");
		al.add("Janhavi");
		al.add("Divyansh");
		al.add(10);
		al.add('q');
		System.out.println(al);

		System.out.println("---------------------------------------------------");
		System.out.println("Using iterator: ");
		Iterator i = al.iterator();
		{
			while (i.hasNext()) {
				System.out.println(i.next());

			}

		}

		System.out.println("---------------------------------------------------");
		System.out.println("Using list iterator: ");
		ListIterator li = al.listIterator();
		while (li.hasNext()) {
			System.out.println(li.next());
		}
		System.out.println("Reverse operation: ");
		while (li.hasPrevious()) {
			System.out.println(li.previous());
		}

		System.out.println("--------------------------------------------");
		System.out.println("Using for loop");
		for(Object a:al)
		{
			System.out.println(a);
		}

	}

}
