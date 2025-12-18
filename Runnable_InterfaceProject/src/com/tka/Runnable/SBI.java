package com.tka.Runnable;

public class SBI implements Runnable {
	public static int balance=1000;

	@Override
	public void run() {
		for(int i=0;i<7;i++) {
		withdraw(100);
		}
		
		
	}

	private synchronized void withdraw(int amt) {
		
		if(balance>=amt) {
			System.out.println(Thread.currentThread().getName()+" Going to withdraw of Rs:- "+amt);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			balance=balance-amt;
			System.out.println(Thread.currentThread().getName()+" Withdraw successfull: "+balance);
		}
		else {
			System.out.println("Insufficient balance: ");
		}
		
	}

}
