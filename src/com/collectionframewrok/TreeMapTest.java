package com.collectionframewrok;

import java.util.TreeMap;

public class TreeMapTest {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		TreeMap<String, Double> hm=new TreeMap<>(new MyCom());
		hm.put("John", new Double(3232.0));
		hm.put("Tom", new Double(6574.0));
		hm.put("Tod", new Double(7821.0));
		hm.put("Hall", new Double(1245.0));
		hm.put("John", new Double(9654.0));
		System.out.println(hm);
		System.out.println(hm.subMap("Hall", "Tom"));
		System.out.println(hm.headMap("Tom"));
		System.out.println(hm.tailMap("Hall"));
		System.out.println(hm.firstKey());
		System.out.println(hm.lastKey());
		

	}

}
