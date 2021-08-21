package com.linkedin.profile;

class MulThread extends Thread{
	String name;
	Thread t;
	MulThread(String name){
		super(name);
		this.name=name;
		start();
	}
	// This is the entry point
	//isAlive(), join();
	public void run(){
		try{
			for(int i=0;i<5;i++){
				Thread.sleep(1000);//
				System.out.println("I value: "+i);
				System.out.println("inside run method: "+Thread.currentThread());
				test();
			}
		}catch(InterruptedException e){
			System.out.println("Child Thread is Interrupted");
		}
		System.out.println(name + "exiting.");
	}
	public static void test(){
	System.out.println("outside run method");
	}
	public static void main(String[] args){
	MulThread obj1=	new MulThread("One");
	MulThread obj2=	new MulThread("Two");
	MulThread obj3=new MulThread("Three");
	obj1.setPriority(11);
		System.out.println("Thread one is alive: "+ obj1.isAlive());
		System.out.println("Thread two is alive: "+ obj2.isAlive());
		System.out.println("Thread three is alive: "+ obj3.isAlive());
		try{
			obj1.join(5000);
			obj2.join(8000);
			obj3.join(10000);
		}catch(InterruptedException ex){
			System.out.println("main thread is Interrupted");
		}
		System.out.println("Thread one is alive: "+ obj1.isAlive());
		System.out.println("Thread two is alive: "+ obj2.isAlive());
		System.out.println("Thread three is alive: "+ obj3.isAlive());
		System.out.println("Main thread exiting");
	}
}
			
		
		