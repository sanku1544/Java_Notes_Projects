package com.tka.Oct31;

public class Unary {
 public static void main(String[] args) {
	 int n=4;
	 n +=5;
	 int b = n++ + n-- + --n;
	 System.out.println(b);
 }
}
