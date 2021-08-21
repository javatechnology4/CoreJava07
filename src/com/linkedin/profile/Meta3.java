package com.linkedin.profile;

import java.lang.annotation.Annotation;

@MyAnno(str="Meta3 class Annotaions",val=78)
public class Meta3 {
	public static void meth(@TypeAnno String str)throws @TypeAnno NullPointerException {
		Meta3 ob=new Meta3();
		for(Annotation annotations:ob.getClass().getAnnotations())
			System.out.println(annotations);
	}
	public static void main(String[] args) {
		meth("String");
	}
	public @TypeAnno String test() {
		return "";
	}

}
