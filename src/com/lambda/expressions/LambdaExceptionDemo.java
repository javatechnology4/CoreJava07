package com.lambda.expressions;

public class LambdaExceptionDemo {

	public static void main(String[] args) throws EmptyArrayException {
		double[] values= {1.0,2.0,3.0,4.0};
		DoubleNumericArrayFunc funcReference=(n)->{
			double sum=0.0;
			if(n.length==0)
				throw new EmptyArrayException();
			for(int i=0;i<n.length;i++)
				sum+=n[i];
			return sum;
		};
		System.out.println("The sum of: " +funcReference.func(values));
		System.out.println("The sum of: " +funcReference.func(new double[0]));

	}

}
