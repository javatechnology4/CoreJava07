package com.linkedin.profile;

enum Apple{
	Jon, Golden, Red,Noah, Cristal
}
class EnumDemo3{
	public static void main(String[] ars){
		Apple ap,ap2,ap3;
		for(Apple a:Apple.values())
			System.out.println(a.ordinal());
		ap=Apple.Jon;
		ap2=Apple.Golden;
		ap3=Apple.Cristal;
		if(ap.compareTo(ap2)<0)
			System.out.println(ap + "comes before " + ap2);
		if(ap.compareTo(ap2)>0)
			System.out.println(ap2 + "comes before " + ap);
		if(ap.compareTo(ap3)==0)
			System.out.println(ap + "equals " + ap3);
		if(ap.equals(ap3))
			System.out.println("ap and ap3 both are equals");
	}
}
			