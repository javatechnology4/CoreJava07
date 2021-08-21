package com.facebook.instgram.member.profile;

public class StackTest{
	public static void main(String[] args){
		FixedStack stack1=new FixedStack(5);
		FixedStack stack2=new FixedStack(8);
		for(int i=0;i<25;i++) stack1.push(i);
		for(int i=0;i<12;i++) stack2.push(i);
		
		for(int i=0;i<25;i++) System.out.print(stack1.pop()+" ");
		System.out.println();
		for(int i=0;i<12;i++) System.out.print(stack2.pop()+" ");
	}
}