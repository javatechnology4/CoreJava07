package com.linkedin.profile;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;

@Retention(RUNTIME)
public @interface MyAnno {
	String str() default "String";
	int val()default 9000;

}
