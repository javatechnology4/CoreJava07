package com.linkedin.profile;

import java.lang.annotation.Annotation;

@What(description="An annotation test class")
@MyAnno(str="Meta1", val=99)
public class Meta2 {
	@What(description="An annotation test method")
	@MyAnno(str="Method", val=45)
	public static void meth() {
		Meta2 ob=new Meta2();
		for(Annotation annotations: ob.getClass().getAnnotations())
			System.out.println(annotations);
		
		try {
			for(Annotation annotations: ob.getClass().getMethod("meth").getAnnotations())
				System.out.println(annotations);
		} catch (NoSuchMethodException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(ob.getClass().isAnnotationPresent(MyAnno.class))System.out.println("True");
		for(MyAnno annotationsByType:ob.getClass().getAnnotationsByType(MyAnno.class))
			System.out.println(annotationsByType);
		
	}
	public static void main(String[] args) {
		meth();
	}

}
