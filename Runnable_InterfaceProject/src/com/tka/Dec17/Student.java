package com.tka.Dec17;

public class Student extends Thread {
	private int Id;
	
	public Student(int Id) {
		this.Id=Id;
	}
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+" ---> "+Id+" Start ");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+" ---> "+Id+" Finished ");
		
	}

}
