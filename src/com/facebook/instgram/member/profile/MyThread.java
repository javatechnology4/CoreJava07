package com.facebook.instgram.member.profile;

class MyThread implements Runnable{
	Thread t;
	MyThread(){
		//creating new Thread
		t=new Thread("Demo Thread");
		System.out.println("Child Thread: "+t);
		t.start();
	}
	@Override
	public void run(){
		try{
			for(int i=0;i<5;i++){
				Thread.sleep(1000);//
				System.out.println("I value: "+i);
				System.out.println("run method: "+Thread.currentThread());
			}
		}catch(InterruptedException e){
			System.out.println("Main Thread is Interrupted");
		}
	}
	
}