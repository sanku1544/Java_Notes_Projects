package com.tka.Multilevel;

public class Test {

	public static void main(String[] args) {
		C.Parent();
		C c1=new C();
		c1.m1();
		c1.age(15);
		c1.m2();
		String s=c1.m3("Sanket");
		System.out.println(s);
		
	
		
	}

}
