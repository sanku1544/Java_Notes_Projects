package com.tka.Nov29;

public class Hotel {
 private String cname;
 
  private int sdays;
  private int choice;
  
  private int total;
  private int disc;
  private static int amount;
  
  Hotel(String n,int d,int disc) {
	   this.cname=n;
	  
	   this.sdays=d;
	   this.disc=disc;
	  
  }
  void Choose(int n) {
	  
	  if(n==1) {
		  choice=n;
		  amount=1000;
		  System.out.println(" Thanks for choosing Non-A/C room: "+amount);
	  }else
	  if(n==2) {
		  choice=n;
		  amount=1500;
		  System.out.println("Thanks for choosing A/C room: "+amount);
	  }else
	  if(n==3) {
		  choice=n;
		  amount=2000;
		  System.out.println("Thanks for choosing Delux room: "+amount);
	  }
	  else {
		  
		  System.out.println("Sorry please enter proper choice ");
	  }
  }
 
  void TotalAmout() {
	  total=sdays*amount-disc;
	  System.out.println("--------------Bill--------------");
	  System.out.println("Stay Days:"+sdays);
	  System.out.println("Room amount:"+amount);
	  System.out.println("Discount:"+disc);
	  System.out.println("Total Bill is: "+total);
	  
  }
  void Payment(String upi) {
	  System.out.println("Payment sucessful of RS: "+total);
  }
  
  
}
