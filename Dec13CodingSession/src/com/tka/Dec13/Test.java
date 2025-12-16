package com.tka.Dec13;

import java.util.Scanner;

public class Test {
	void Patt() {
		Patterns p1=new Patterns();
		p1.Pattern57();
		System.out.println("-----------------------");
		p1.Pattern58();
		System.out.println("-----------------------");
		p1.Pattern59();
		System.out.println("-----------------------");
		p1.Pattern60();
		System.out.println("-----------------------");
		p1.Pattern62();
		System.out.println("-----------------------");
		p1.Pattern63();
		System.out.println("-----------------------");
		p1.Pattern64();
		System.out.println("-----------------------");
		p1.Pattern65();
		System.out.println("-----------------------");
		p1.Pattern66();
		System.out.println("-----------------------");
		p1.Pattern67();
		System.out.println("-----------------------");
		p1.Pattern68();
		System.out.println("-----------------------");
	}
	void whileloop() {
		WhileLoop obj=new WhileLoop();
		obj.p64();
		obj.p65();
		obj.p66();
		obj.p67();
		obj.p68();
		obj.p69();
		obj.p70();
	}

	public static void main(String[] args) {
		
		Scanner sc=new  Scanner(System.in);
		System.out.println("Enter choice auto or car ");
		String ch=sc.nextLine();
		
		UberCab u1=new UberCab(2,"Sanket" , "Karve Nagar", "Hadapsar", ch);
		Details d1=new Details();
		
		d1.enterOTP(u1, 5);
	}

}
