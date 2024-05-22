package com.dailypractise;
import java.util.*;
public class Map1 {

	public static void main(String[] args) {
		Map mp=new HashMap();
		mp.put(1,"sanskruti");
		mp.put(2, "Thorat");
		mp.put(3,"I love myself");
		System.out.println(mp);
		mp.containsKey(1);
		mp.containsValue("sanskruti");
		mp.remove(2);
		System.out.println(mp);
		System.out.println(mp.get(1));
		System.out.println(mp.isEmpty());
		Map m2=new HashMap();
		mp.putAll(m2);
		System.out.println(m2);
		System.out.println(mp.size());
	}

}
