package com.spring.core;

public class Piano implements Instrument {
	private String property;

	@Override
	public void play() {
		System.out.println("PLINK PLINK PLINK PLINK");
		
	}
	public void setProperty(String property) {
		this.property="property";
	}

	@Override
	public void tune() {
		System.out.println("Piano tune");
		
	}

	@Override
	public void clear() {
		System.out.println("remove piano object");
		
	}

}
