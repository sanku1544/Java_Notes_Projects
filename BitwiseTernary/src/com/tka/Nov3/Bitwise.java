package com.tka.Nov3;

public class Bitwise {
	public static void main(String[] args) {
		int a = 5;  // & and
		int b = 2;
		int c = a & b; // Compare the binary values
		System.out.println(c);
		
		// |  OR
		
		int e = a | b;
		System.out.println(e);
		
		// ^ XOR 
		
		int f = a^b;
		System.out.println(f);
		
		// ~ NOT
		
		int g = ~ b;
		System.out.println(g);
		
		// >> Right Shift
		
		int h = 4>>2;
		System.out.println(h);
		
		// << Left Shift
		
		int i = 6 << 2;
		System.out.println(i);
		
	}

}
