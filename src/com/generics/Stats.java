package com.generics;

public class Stats<T extends Number> {
	T[] nums;
	public Stats(T[] o) {
		nums=o;
	}
	double average() {
		double sum=0.0;
		for(int i=0;i<nums.length;i++)
			sum+=nums[i].doubleValue();
		return sum;
	}
	boolean sameAvg(Stats<?> obj) {
		if(average()==obj.average())
			return true;
		return false;
	}

}
