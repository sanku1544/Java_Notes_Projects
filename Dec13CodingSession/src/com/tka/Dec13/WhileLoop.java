package com.tka.Dec13;

public class WhileLoop {
      void p64() {
    	  int  fact=1;
    	  int n=5;
    	  int i=1;
    	  while(i<=n) {
    		  fact=fact*i;
    		  i++;
    	  }
    	  System.out.println(fact);
      }
      
      void p65() {
    	  int n=4519;
    	  int r;
    	  int sum=0;
    	  while(n>0) {
    		  r=n%10;
    		  sum=sum+r;
    		  n=n/10;
    	  }
    	  System.out.println("Sum is: "+sum);
      }
      void p66() {
    	  int n=4519;
    	  int r;
    	  int count=0;
    	  while(n>0) {
    		  r=n%10;
    		  n=n/10;
    		  count++;
    	  }
    	  System.out.println("Count is: "+count);
      }
      void p67() {
    	  int n=4519;
    	  int r;
    	  int rev=0;
    	  while(n>0) {
    		  r=n%10;
    		  rev=rev*10+r;
    		  n=n/10;
    		 
    	  }
    	  System.out.println("Reverse is: "+rev);
      }
      void p68() {
    	  int n=451154;
    	  int bku=n;
    	  int r;
    	  int rev=0;
    	  while(n>0) {
    		  r=n%10;
    		  rev=rev*10+r;
    		  n=n/10;
    		  
    	  }
    	  if(bku==rev) {
    	  System.out.println("Palindrome ");
    	  }else {
    	  System.out.println("Not Palindrome ");
    	  }
      }
      void p69() {
    	  int n=153;
    	  int bku=n;
    	  int r;
    	  int rev=0;
    	  while(n>0) {
    		  r=n%10;
    		  rev=rev+r*r*r;
    		  n=n/10;
    		  
    	  }
    	  
    	  if(bku==rev) {
    		  System.out.println("Armstrong: "+bku);
    	  }else {
    		  System.out.println("Not Armstrong: "+bku);
    	  }
      }
      void p70() {
    	  int n=451154;
    	  int i=1;
    	  System.out.println("Factors of "+n+" is:- ");
    	  while(i<n) {
    		  if(n%i==0) {
    			  System.out.println(i+" ");
    		  }
    		  i++;
    	  }
      }
      void p71() {
    	  int n=12;
    	  int b=16;
    	  int i=1;
    	  System.out.println("Factors of "+n+" and "+b+" is:- ");
    	  while(i<n && i<b) {
    		  if(n%i==0) {
    			  System.out.println(i+" ");
    		  }
    		  if(b%i==0) {
    			  System.out.println("\t"+i+" ");
    		  }
    		  i++;
    	  }
      }
}
