class TestStack{
	public static void main(String[] stack){
		Stack st=new Stack();
		for(int i=0;i<st.stck.length;i++){
			st.push(i);
		}
		for(int i=0;i<st.stck.length;i++)
			System.out.println(st.pop());
		
		
	}
}