package com.dailypractise;
import java.util.*;
public class linkedList1 {
	public static void main(String arg[])
	{
		LinkedList l1=new LinkedList();
		l1.add(1);
		l1.add(2);
		l1.add(3);
		l1.add(4);
		l1.add(5);
		l1.add(6);
		//l1.add(7,'Sanskruti');
		l1.add(7, "Sanskruti");
		System.out.println(l1);
		l1.remove(2);
		System.out.println(l1);
		l1.removeFirst();
		l1.removeLast();
		System.out.println(l1);
	}
}
