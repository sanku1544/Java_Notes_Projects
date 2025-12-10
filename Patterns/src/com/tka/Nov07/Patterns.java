package com.tka.Nov07;

public class Patterns {
	void pattern1(int n) {
		for(int row=1;row<=n;row++) {
			for(int col=1;col<=row;col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	void pattern2(int n) {
		for(int row=1;row<=n;row++) {
			for(int col=1;col<=row;col++) {
				System.out.print(" "+row+" ");
			}
			System.out.println(" ");
		}
	}
	void pattern3(int n) {
		for(int row=1;row<=n;row++) {
			for(int col=1;col<=n-row+1;col++) {
				System.out.print(col+" ");
			}
			System.out.println();
		}
	}
	void pattern4(int n) {
		
		for(int row=1;row<=n;row++) {
			int count=n;
			for(int col=1;col<=n-row+1;col++) {
				System.out.print(count+" ");
				count--;
			}
			System.out.println();
		}
	}
}

