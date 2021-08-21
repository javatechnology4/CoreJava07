package com.linkedin.profile;

import java.lang.reflect.Method;

public class Meta {
	@MyAnno(str="Annotation Example",val=100)
	public static void myMeth(String str, int val) {
		Meta ob=new Meta();
		Class<? extends Meta> class1 = ob.getClass();
		try {
			Method method = class1.getMethod("myMeth",String.class,int.class);
			MyAnno annotation = method.getAnnotation(MyAnno.class);
			System.out.println(annotation.str()+ " " + annotation.val());
		} catch (NoSuchMethodException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		myMeth("Test",10);
	}

}
