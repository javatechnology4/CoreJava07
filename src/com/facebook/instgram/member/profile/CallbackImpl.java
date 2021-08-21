package com.facebook.instgram.member.profile;

public class CallbackImpl implements Callback{
	public void callback(int param){
		System.out.println("callback method is called with "+ param);
	}
	void cabackTest(){
		System.out.println("CallBackImpl own method");
	}
	@Override
	public void test() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void callbackmethod() {
		// TODO Auto-generated method stub
		
	}
}
	