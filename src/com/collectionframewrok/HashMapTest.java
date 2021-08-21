package com.collectionframewrok;

import java.util.Collection;
import java.util.HashMap;

public class HashMapTest {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		HashMap<String, Double> hm=new HashMap<>();
		hm.put("John", new Double(3232.0));
		hm.put("Tom", new Double(6574.0));
		hm.put("Tod", new Double(7821.0));
		hm.put("Hall", new Double(1245.0));
		hm.put("John", new Double(9654.0));
		//for(String key:hm.keySet())
			//System.out.println(hm.get(key));
		Collection<Double> values = hm.values();
		for (Double double1 : values) {
			System.out.println(double1);
		}
		

	}

}
