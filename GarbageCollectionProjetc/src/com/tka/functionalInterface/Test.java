package com.tka.functionalInterface;

public class Test {

	public static void main(String[] args) {
		
		MyFunction m1= new MyFunction() {
			
			@Override
			public int compute(int a, int b) {
				return a+b;
			}
		};
		int res=m1.compute(5,8);
		System.out.println("Addition is: "+res);
		
		MyFunction m2= (a,b)->a-b;
		int res2=m2.compute(12,8);
		System.out.println("Sub no is: "+res2);
								
		MyFunction m3= (a,b)->{if(a>b)  return a*a; else  return b*b;};
				int res3=m3.compute(12,8);
				System.out.println("Max no is: "+res3);
		
	
		
				
		
	}

}
