package com.tka.Dec16;

public class Example2 extends Thread {
  @Override
  public void run() {
	  for(int i=65;i<75;i++) {
		  //System.out.println((char)i+" ");
		  System.out.println(Thread.currentThread().getName());
		  try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	  }
	  System.out.println("End of "+Thread.currentThread().getName());
	  System.out.println("Priority of Example 2: "+Thread.currentThread().getPriority());
  }
}
