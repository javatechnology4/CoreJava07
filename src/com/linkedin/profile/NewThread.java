package com.linkedin.profile;

public class NewThread extends Thread{
	public NewThread() {
		super("Demo Thread");
		System.out.println("Child Thread"+this);
		start();
	}
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
