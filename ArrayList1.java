package com.dailypractise;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayList1 {
	public static void main(String args[]) {
		ArrayList al = new ArrayList();
		al.add(1);
		al.add("Sanskruti");
		al.add("Nashik");
		al.add(10);
		System.out.println("Object printing: " + al);

		System.out.println("--------------------------------------------------");
		Iterator itr = al.iterator();
		System.out.println("Elements printing: ");
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("--------------------------------------------------");

		List l1=new ArrayList();
		l1.add(10);
		l1.add("Sanskruti");
		l1.add("Shailaa");
		l1.add(77);
		System.out.println("Object printing: "+l1);
		System.out.println("--------------------------------------------------");

		ListIterator li=l1.listIterator();
		while(li.hasNext())
		{
			System.out.println("Next:"+li.next());
		}
		System.out.println("--------------------------------------------------");

		while(li.hasPrevious())
		{
			System.out.println("Previous: "+li.previous());
		}
	}

}
