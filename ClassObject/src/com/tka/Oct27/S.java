package com.tka.Oct27;

public class S {
	public void m1() {
		System.out.println(2121);
		S s1 = new S();
		System.out.println(s1);
		s1.m2();
	}
	public void m2() {
		System.out.println(2121);
		S s1 = new S();
		System.out.println(s1);
		s1.m1();
	}
}
