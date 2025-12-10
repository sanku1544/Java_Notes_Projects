package com.tka.Multilevel;

public class B extends A {
	public void m2() {
		System.out.println("Calling Parent");
	}
	static void Parent() {
		System.out.println("Multilevel Inheritance");
	}
	B(){
		super(500,"pratik");
	System.out.println("B Constructor");
	
	}
	
}
