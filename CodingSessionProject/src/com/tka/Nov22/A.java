package com.tka.Nov22;


public class A {
	private Long id;
	private int count=0;
    private Long s=0L;
    A(Long a){
    	this.id=a;
    }
	void last4Digits() {
		Long rev=0L;
		System.out.println("Transaction No= "+id);
		while(id>0){
	        
	         
	        if(count==4){
	            break;
	        }
	        rev = id%10;
	        s=s*10+rev;
	        id=id/10;
	        count++;
	        
	       }
		System.out.println("Last 4 digits= "+s);
		
	}
	void checkPalindrome() {
		Long c=s;
	    Long t=0L;
	    while(c>0) {
	    	   Long rev=c%10;
	    	   t=t*10+rev;
	    	   c=c/10;
	       }
	     
	       if(s.equals(t)) {
	    	   System.out.println("Palindrome");
	       }
	       else {
	    	   System.out.println("Not");
	       }
	}
 
  
}
