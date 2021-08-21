package com.spring.core;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

public class OneManBand implements Performer{
	//private Collection<Instrument> instruments;
	//private Map<String, Instrument> instruments;
	private Properties instruments;
	public OneManBand() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void perform() throws PerformanceException {
		for(Iterator it=instruments.keySet().iterator(); it.hasNext();) {
			String key=(String)it.next();
			System.out.println(key +":"+instruments.getProperty(key));
		}
		/*for(String key:instruments.keySet()) {
			instruments.get(key).play();
		}*/
		/*instruments.forEach(instrument->{
			instrument.play();
		});*/
		
	}
	/*public void setInstruments(Collection<Instrument> instruments) {
		this.instruments=instruments;
	}*/
	/*public void setInstruments(Map<String, Instrument> instruments) {
		this.instruments=instruments;
	}*/
	public void setInstruments(Properties instruments) {
		this.instruments=instruments;
	}
	//byName, byType, constructor

}
