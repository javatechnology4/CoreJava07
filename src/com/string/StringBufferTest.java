package com.string;

public class StringBufferTest {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("Hello");
		/*System.out.println(sb.length());
		System.out.println(sb.capacity());
		sb.ensureCapacity(245);
		sb.setLength(78);
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		System.out.println(sb.charAt(2));
		sb.setCharAt(3, 'T');*/
		sb.append(" append");
		sb.insert(12, " insert");
		System.out.println(sb);
		System.out.println(sb.length());
		System.out.println(sb.reverse());
		//sb.delete(start, end)

	}

}
