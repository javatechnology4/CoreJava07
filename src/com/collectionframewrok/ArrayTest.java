package com.collectionframewrok;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayTest {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<>();
		al.add("AB");
		al.add("CD");
		al.add("EF");
		al.add("GH");
		al.add("AB");
		al.add("IJ");
		al.add("KL");
		al.add("AB");
		al.add("MN");
		al.add("OP");
		al.add("QR");
		al.add("AB");
		al.add(null);
		Iterator<String> iterator = al.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
			//iterator.remove();
		}
		ListIterator<String> listIterator = al.listIterator();
		while(listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}
		while(listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}
		//System.out.println(al);
		
	}

}
