package com.tka.Nov11;

public class Test {

	public static void main(String[] args) {
		staticVariable.roll=78;
		System.out.println(staticVariable.roll);
		staticVariable s1 =new staticVariable();
		int show=s1.update(5);
		System.out.println(show);
		staticVariable s2= new staticVariable();
		s2.newRoll(8);
		
		staticVariable s5= new staticVariable();
		s5.showCount();
		
	}

}
