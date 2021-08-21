package com.linkedin.profile;

import java.lang.annotation.Annotation;
@MyMarker
public class Marker {
	public static void meth() {
		Marker ob=new Marker();
		for(Annotation annotations:ob.getClass().getAnnotations())
			System.out.println(annotations);
	}
	public static void main(String[] args) {
		meth();
	}


}
