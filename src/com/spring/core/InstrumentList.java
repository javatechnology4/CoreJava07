package com.spring.core;

public class InstrumentList implements Performer{
	private String song;
	private int count;
	private String message;
	private Instrument instrument;
	public InstrumentList(String song) {
		this.song=song;
	}
	public InstrumentList() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void perform() throws PerformanceException {
		System.out.println("Playing " +song+" :");
		System.out.println("finding " +count+" :");
		System.out.println("finding " +message+" :");
		instrument.play();
		
	}
	public void setSong(String song) {
		this.song=song;
	}
	public void setCount(int count) {
		this.count=count;
	}
	public void setMessage(String message) {
		this.message=message;
	}
	public void setInstrument(Instrument instrument) {
		this.instrument=instrument;
	}
	public void tuneInstrument() {
		instrument.tune();
	}
	public void clearInstrument() {
		instrument.clear();
	}

}
