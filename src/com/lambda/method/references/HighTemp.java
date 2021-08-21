package com.lambda.method.references;

public class HighTemp {
	private int hTemp;

	public HighTemp(int ht) {
		hTemp = ht;
	}

	boolean sameTemp(HighTemp ht1) {
		return hTemp == ht1.hTemp;
	}

	boolean lessThanTemp(HighTemp ht1) {
		return hTemp < ht1.hTemp;
	}

}
