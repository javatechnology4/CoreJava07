package com.string;

public class StringTest1 {
	static String arr[]= {"Now","is","the","time","for","all","good","Country","their","aid","come"};

	public static void main(String[] args) {
		/*for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i].compareTo(arr[j])<0)
					System.out.println("arr[i].compareTo(arr[j])<0 " + arr[j]);
				else if(arr[i].compareTo(arr[j])>0)
					System.out.println("arr[i].compareTo(arr[j])>0 " + arr[j]);
				else if(arr[i].compareTo(arr[j])==0)
					System.out.println("arr[i].compareTo(arr[j])==0 " + arr[j]);
			}
		}*/
		int age=9;
		String str=" He is "+age+ " Years old  ";
		String concat = str.concat("concat");
		System.out.println(concat);
		String replace = str.replace('H', 'h');
		System.out.println(replace);
		String trim = str.trim();
		System.out.println(trim);
		String lowercase = str.toUpperCase();
		System.out.println(lowercase);
		//System.out.println(str.lastIndexOf('s'));
		//String substring = str.substring(4);
		//System.out.println(substring);
		
		/*String longStr="This could have been "+
	"a very long line that would have ";
		System.out.println(longStr);
		
		int age=9;
		String str="He is "+age+ " Years old";
		System.out.println(str);
		String str1="four: " +(2+2);
		System.out.println(str1.charAt(str1.length()));*/
		//String s="This is demo of the getChars method";
		/*int start=10;
		int end=14;
		char buf[]=new char[end-start];
		s.getChars(start, end, buf, 0);
		System.out.println(buf);
		byte bu[]=new byte[end-start];
		s.getBytes(start, end, bu, 0);
		
		for(byte b:bu)
			System.out.println(b);*/
		/*for(char ch:s.toCharArray())
			System.out.print(ch);*/
		/*String s1="Hello";
		String s2="Hello";
		String s3="Good-Bye";
		String s4="HELLO";
		System.out.println(s1 + " equals "+s2 + "-> "+s1.equals(s2));
		System.out.println(s1 + " equals "+s3 + "-> "+s1.equals(s3));
		System.out.println(s1 + " equals "+s4 + "-> "+s1.equals(s4));
		System.out.println(s1 + " equalsIgnoreCase "+s4 + "-> "+s1.equalsIgnoreCase(s4));*/
		//.args.String str1="four: " +(2+2);
		//System.out.println(str1);
		//System.out.println(str1.startsWith("four"));
		//System.out.println(str1.startsWith("our", 1));
		//System.out.println(str1.endsWith("4"));
		
		

	}

}
