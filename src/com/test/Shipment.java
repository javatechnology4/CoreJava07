package com.test;
public class Shipment extends BoxWeight{
	double cost;
	Shipment(Shipment obj){
		super(obj);
		cost=obj.cost;
	}
	Shipment(double w, double h, double d, double we, double co){
		super(w,h,d,we);
		cost=co;
	}
	Shipment(){
		super();
		cost=-1;
	}
	Shipment(double len,double m, double c){
		super(len, m);
		cost=c;
	}
}
	