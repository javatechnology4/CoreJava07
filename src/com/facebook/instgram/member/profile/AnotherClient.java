package com.facebook.instgram.member.profile;

class AnotherClient implements Callback{
	public void callback(int p){
		System.out.println("Another version of callback");
		System.out.println("p squared is "+(p*p));
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