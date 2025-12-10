package com.tka.Nov13;

public class practice {
	private  int roll=15;
	
	
	static void m1() {
		practice p1=new practice();
		System.out.println("Roll  no is : "+p1.roll);
		System.out.println("---------------------");
	}
	
	private practice() {
		System.out.println("Private constructor  calling ");
	}
	

}
