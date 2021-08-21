package com.facebook.instgram.member.profile;

public class CurrentThreadDemo {

	public static void main(String[] args) throws InterruptedException {
		Thread t=Thread.currentThread();
		System.out.println("Current Thread: "+t);//@#14587@$%
		t.setName("My Thread");
		System.out.println("Current Thread: "+t);
		for(int i=0;i<5;i++){
			Thread.sleep(1000);
			System.out.println("I value: "+i);
		}
		/*try{
			
		}catch(InterruptedException e){
			System.out.println("Main Thread is Interrupted");
		}*/

	}

}
