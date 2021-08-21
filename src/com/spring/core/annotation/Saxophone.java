package com.spring.core.annotation;

import org.springframework.stereotype.Component;

//@Component
public class Saxophone implements Instrument{
	public Saxophone() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void play() {
		System.out.println("TOOT TOOT TOOT TOOT");
		
	}

	@Override
	public void tune() {
		System.out.println("Saxophone tune");
		
	}

	@Override
	public void clear() {
		System.out.println("remove saxophone object");
		
	}

}
