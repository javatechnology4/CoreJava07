package com.spring.core;

public class SaxophoneImpl implements Instrument{

	@Override
	public void play() {
		System.out.println("Sax Sax Sax Sax");
		
	}

	@Override
	public void tune() {
		System.out.println("SaxophoneImpl tune ");
		
	}

	@Override
	public void clear() {
	System.out.println("remvoe Impl object");
		
	}

}
