package com.tka.Runnable;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		
		SBI s1=new SBI();
		
		
		Thread t1=new Thread(s1);
		t1.setName("Sanket");
		Thread t2=new Thread(s1);
		t2.setName("Nikam");
		
		t1.start();
		t2.start();

	}

}
