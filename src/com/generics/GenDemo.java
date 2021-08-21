package com.generics;

public class GenDemo {

	public static void main(String[] args) {
		Gen<Integer> obj;
		obj=new Gen<Integer>(88);
		obj.showType();
		int v=obj.getOb();
		System.out.println("value : " +v);
		System.out.println();
		
		Gen<String> obj2=new Gen<String>("Generics Test");
		//Gen<String> obj3=new Gen<String>(88);
		obj2.showType();
		
		String val=obj2.getOb();
		System.out.println("value :" +val);
		Gen<Character> obj3=new Gen<Character>('A');
		/*NonGen obj=new NonGen(88);
		obj.showType();
		
		Object ob = obj.getOb();
		System.out.println("object value: " +ob);
		
		NonGen obj2=new NonGen("Generics Test");
		obj2.showType();
		
		Object ob1 = obj2.getOb();
		Boolean str=(Boolean)ob1;
		System.out.println("object value: " +ob1);
		System.out.println(str);*/

	}

}
