package com.spring.core.annotation;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
//@Component("performer")// instrumentList
public class InstrumentList implements Performer{
	@Value("song")
	private String song;
	@Value("12")
	private int count;
	@Value("message")
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
	@SpringAutowired
	@Qualifier(value="piano")
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
