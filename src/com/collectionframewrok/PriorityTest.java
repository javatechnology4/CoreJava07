package com.collectionframewrok;

import java.util.PriorityQueue;

public class PriorityTest {

	public static void main(String[] args) {
		PriorityQueue<String> pq=new PriorityQueue<>();
		pq.add("AA");
		pq.add("BB");
		pq.add("CC");
		pq.add("DD");
		pq.add("QQ");
		pq.add("ZZ");
		System.out.println(pq);
		pq.remove();
		pq.element();

	}

}
