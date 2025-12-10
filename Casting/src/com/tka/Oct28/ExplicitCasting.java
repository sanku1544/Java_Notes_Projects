package com.tka.Oct28;

public class ExplicitCasting {
	public static  void main(String[] args) {
		long b1=  7720058578L;
		System.out.println(b1);
		
		int s1= (int)b1;
		System.out.println(s1);
		
		byte n1= (byte)s1;
		System.out.println(n1);
		
		double d1= 151551312321.241312215252d;
		System.out.println(d1);
		
		float f1 = (float)d1;
		System.out.println(f1);
		
		char  c1 ='z';
		System.out.println(c1);
		
		int n2 = (int)c1;
		System.out.println(n2);
		
		char c2 = (char)n2;
		System.out.println(c2);
		
		double d2 = 129d;
		byte v1 = (byte)d2;
		System.out.println(v1);
	}
}
