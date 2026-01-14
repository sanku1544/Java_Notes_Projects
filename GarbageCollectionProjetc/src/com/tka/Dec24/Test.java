package com.tka.Dec24;

public class Test {

	public static void main(String[] args) {
		
		Demo d1= new Demo(12,"Sanket",15000);
		Demo d2=d1;
		
		d1.display();
		
		d1=null;
		d2=null;
		System.gc();
		
		//d1.display();

	}

}
