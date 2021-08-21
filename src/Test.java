//package com.facebook.instagram.member.profile;
class Test{
	/*public void test(int ab,boolean flag){
		System.out.println("test int, boolean parameter  method");
	}
	public void test(double ab, boolean flag){
		System.out.println("test double method");
	}
	public void test(boolean flag, int ab){
		System.out.println("test boolean, int parameter  method");
	}*/
	int a,b;
	Test(int i, int j){
		a=i;
		b=j;
	}

	boolean equalsTo(Test obj){
		/*if(obj.a==a && obj.b==b) return true;
		else return false;*/
		//return (this.a==obj.a && this.b==obj.b);
		return (this==obj);
	}
		
	public static void main(String[] args){
		Test t1=new Test(10,20);
		Test t2=new Test(10,20);
		Test t3=new Test(100,200);
		
		/*Test t=new Test(); // int a,b;
		t.a=10;
		t.b=20;*/
		//Test@bd8db5a
		//Test@2f943d71
		//Test@80503
		System.out.println("t1==t2 " +t1.equalsTo(t2));
		System.out.println("t1==t3 " +t1.equalsTo(t3));
	}
}