package com.lambda.method.references;

public class HighTempDemo {
	static<T> int counter(T[] va,MyFunc<T> mf, T v) {
		int count=0;
		for(int i=0;i<va.length;i++)
			if(mf.func(va[i], v))count++;
		return count;
		
	}

	public static void main(String[] args) {
		int count; 
		HighTemp[] htValues= {new HighTemp(89), new HighTemp(82),
								new HighTemp(90), new HighTemp(89),
								new HighTemp(82),new HighTemp(90)};
		count=	counter(htValues,HighTemp::lessThanTemp,new HighTemp(89));
		System.out.println(count);
		}
	}


