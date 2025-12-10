package com.tka.Nov27;

public class B extends A {
	static int a=8;
	static void m1(String c) {
			System.out.println("B "+c);
		}
	@Override
	
		protected void m2(String c) {
			System.out.println("B "+c);
		}
	B(int a){
		super(a);
		System.out.println("B constructor "+a);
	}
}
