package com.facebook.instgram.member.profile;

import com.linkedin.profile.NewThread;

public class MainThread {

	public static void main(String[] args){
		new NewThread();
		try{
			for(int i=0;i<5;i++){
				Thread.sleep(1000);//
				System.out.println("Main method I value: "+i);
				System.out.println("Main method: "+Thread.currentThread());
			}
		}catch(InterruptedException e){
			System.out.println("Main Thread is Interrupted");
		}
	}

}
