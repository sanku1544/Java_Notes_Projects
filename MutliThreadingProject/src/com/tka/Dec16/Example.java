package com.tka.Dec16;

public class Example extends Thread {
	@Override
	public void  run() {
		for(int i=0;i<6;i++) {
//			System.out.println(i+" ");
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		System.out.println("End of "+Thread.currentThread().getName());
		 System.out.println("Priority of Example 1: "+Thread.currentThread().getPriority());
 }
}
