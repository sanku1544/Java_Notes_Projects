package com.tka.Dec16;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Start "+Thread.currentThread().getName()+" Thread");
		
		Example e1= new Example();
		e1.start();
		
		Example2 e2= new Example2();
		e2.start();
		
		for(int i=95;i<100;i++) {
//			System.out.println((char)i+" ");
			System.out.println(Thread.currentThread().getName());
			Thread.sleep(500);
		}
		 System.out.println("Priority of Main: "+Thread.currentThread().getPriority());
		 System.out.println(Thread.currentThread().isAlive());
		//System.out.println(Thread.currentThread().join());
	}

}
