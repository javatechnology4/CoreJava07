package com.generics;

public class Bound <T extends TwoD>{
	T[] bounds;
	public Bound(T[] bou) {
		bounds=bou;
	}
	static void showXY(Bound<?> obj) {
		System.out.println("Printing X Y values");
		for(int i=0;i<obj.bounds.length;i++) {
			System.out.print(obj.bounds[i].x + " " + obj.bounds[i].y);
		System.out.println();
		}
	}
	static void showXYZ(Bound<? extends ThreeD> obj) {
		System.out.println("Printing X Y values");
		for(int i=0;i<obj.bounds.length;i++) {
			System.out.print(obj.bounds[i].x + " " + obj.bounds[i].y +" "+ obj.bounds[i].z);
		System.out.println();
		}
	}
	static void showAll(Bound<? extends FourD> obj) {
		System.out.println("Printing X Y values");
		for(int i=0;i<obj.bounds.length;i++) {
			System.out.print(obj.bounds[i].x + " " + obj.bounds[i].y +" "+ obj.bounds[i].z +" " +obj.bounds[i].t);
		System.out.println();
		}
	}
	public static void main(String[] args) {
		TwoD td[]= {new TwoD(1,2),new TwoD(45,78),new TwoD(65,54),new TwoD(87,98)};
		Bound<TwoD> bd=new Bound<>(td);
		showXY(bd);
		FourD fd[]= {new FourD(1,2,3,4),new FourD(45,78,41,65),new FourD(65,54,32,21),new FourD(87,98,96,85)};
		Bound<FourD> bd1=new Bound<>(fd);
		showXYZ(bd1);
		/*NonGen ng[]= {new NonGen(88)};
		Bound<NonGen> bd2=new Bound<>(ng);*/
	}

}
