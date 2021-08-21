package com.collectionframewrok;

import java.util.ArrayDeque;

public class ArrayDeQueTest {

	public static void main(String[] args) {
		ArrayDeque<String> ad=new ArrayDeque<>();
		ad.add("Ar");
		ad.addFirst("First");
		ad.offerFirst("offerFirst");
		ad.removeFirst();
		System.out.println(ad);
	}

}
