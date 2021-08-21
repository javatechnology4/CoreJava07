package com.collectionframewrok;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedTest {

	public static void main(String[] args) {
		LinkedList<String> ll=new LinkedList<>();
		ll.add("AA");
		ll.add("BB");
		ll.add("CC");
		ll.add("DD");
		ll.add("EE");
		ll.add("FF");
		ll.add("AA");
		ll.remove(2);
		ll.indexOf("AA");
		System.out.println(ll);
		ArrayList<String> al=new ArrayList<>();
		al.add("AB");
		al.add("CD");
		al.add("EF");
		al.add("GH");
		al.add("AB");
		al.add("IJ");
		ll.containsAll(al);
		ll.get(2);
	}

}
