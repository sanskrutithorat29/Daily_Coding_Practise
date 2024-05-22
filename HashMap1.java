package com.dailypractise;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap1 {

	public static void main(String[] args) {
		HashMap<Integer, String> hm=new HashMap();
		hm.put(1,"Sanskruti");
		hm.put(2,"Janhavi");
		hm.put(3,"Duggi");
		hm.put(1, "Shailaa");
		hm.put(null, "prachi");
		hm.put(null, "aditya");
		hm.remove(1);
		System.out.println(hm.containsKey(3));
		System.out.println(hm.isEmpty());
		System.out.println(hm);
	
		
		
	}

}
