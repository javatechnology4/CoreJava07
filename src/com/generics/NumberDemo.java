package com.generics;

public class NumberDemo {

	public static void main(String[] args) {
		Integer inums[]= {1,2,3,4,5,6,7,8,9};
		Stats<Integer> iob=new Stats<>(inums);
		double average = iob.average();
		System.out.println("Average value: "+average);
		
		Double dnums[]= {10.0,20.0,30.0,40.0,45.0,78.0,98.0};
		Stats<Double> dob=new Stats<>(dnums);
		double av = dob.average();
		System.out.println("Average value: "+av);
		
		//String snums[]= {"Test","ABC","Gen","com"};
		//Stats<String> sob=new Stats<>(snums);
		
		if(iob.sameAvg(dob))
			System.out.println("both objects are equals");

	}

}
