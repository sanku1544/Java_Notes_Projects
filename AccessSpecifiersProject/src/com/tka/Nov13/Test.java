package com.tka.Nov13;
import com.tka.Specifiers1.*;
import com.tka.Specifiers2.*;

public class Test extends Protected {
	
	static {
		System.out.println(AllSpecifiers.cname);
		AllSpecifiers  a1=new AllSpecifiers();
		//System.out.println(a1.roll);
		System.out.println(a1.name);
		System.out.println(a1.fees);
		
		a1.m4();
		
	}
	public static void main(String[] args) {
		
		{
			practice.m1();
		}
		{
			Default.m1();
			Default d1=new Default();
			System.out.println("value of j: "+d1.j);
			int j=d1.m2(5);
			System.out.println("Default method call: "+j);
			System.out.println("---------------------");
		}
		Test p1=new Test(); // protected child class
		int i=p1.addsum(5,5);
		
		System.out.println("Protected method call: "+i);
		System.out.println("Protected variable call: "+p1.name);
		
		
		

	}

}
