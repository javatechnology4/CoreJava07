package com.spring.core;

public class PoJuggler extends Juggler{
	private Poem poem;

	public PoJuggler(int beanBags,Poem poem) {
		super(beanBags);
		this.poem=poem;
	}
	public PoJuggler(Poem poem) {
		super();
		this.poem=poem;
	}
	public void perform() throws PerformanceException {
		super.perform();
		System.out.println("WHILE RECITING.....");
		poem.recite();
	}

}
