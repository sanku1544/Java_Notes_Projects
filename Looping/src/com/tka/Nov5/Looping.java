package com.tka.Nov5;

public class Looping {
	void fiveToOne() {
		for (int i=1;i<=5;i++) {
			System.out.println(6-i);
		}
	}
	void tableOf5(int n) {
		
		for(int i=1;i<=10;i++) {
			System.out.println(n+" * "+i+" = "+(n*i));
		}
	}
	void oddNumbers() {
		int count=0;
		for(int i=1;i<=146;i++) {
			if(i%2!=0) {
				if(i>=123 && i<=146) {
					System.out.println(i);	
					count++;
				}
			}
		}
			System.out.println("Total No.s "+count);
	}
	
}
	
