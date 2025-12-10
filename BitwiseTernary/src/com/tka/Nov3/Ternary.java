package com.tka.Nov3;

public class Ternary {
  public static void main(String[] args) {
	  int a = 32;
	  int b = 43;
	  int c  = 31;
	 
	  
	  int res = (b>c?b:(a>c?a:c));
	  System.out.println(res);
	  
	  int out = (a>b?b++:(c>a?c:b));
	  System.out.println(out);
  }
}
