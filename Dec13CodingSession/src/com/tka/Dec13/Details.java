package com.tka.Dec13;

import java.util.Scanner;

public class Details {
	 
	void enterOTP(UberCab ub,int km) {
		int ot=123;
		System.out.println("Please enter yes or no for startride");
		Scanner sc=new  Scanner(System.in);
		String resp=sc.nextLine();
		
		if(resp.equalsIgnoreCase("yes")) {
			System.out.println("Enter OTP ");
			int otp=sc.nextInt();
		if(ot==otp) {
			System.out.println("OTP verified ");
			startRide(ub,km);
		}else {
			System.out.println("Sorry OTP is not valid:");
		}
		}else if(resp.equalsIgnoreCase("no")){
			cancelRide();
		}	else {
			System.out.println("Enter yes or no properly");
		}
	   }
	  private void startRide(UberCab ub,int km) {
		  calculateBill(ub,km);
		   
	   }
	 private  void cancelRide() {
		   System.out.println("Ride is canceled succesfully: ");
	   }
	 private  void calculateBill(UberCab ub,int km) {
		   int totalBill;
		   String ucab=ub.getcType();
		   int price=0;
		   if(ucab.equalsIgnoreCase("auto")) {
			   price=20;
		   }else if(ucab.equalsIgnoreCase("car")) {
			   price=50;
		   }else {
			   System.out.println("Enter proper CabType auto or car");
		   }
		   
		   System.out.println("--------------------------------");
		   System.out.println("Id is: "+ub.getId());
		   System.out.println("Name of customer is: "+ub.getName());
		   System.out.println(ucab.toUpperCase()+" Price is:- "+price);
		   System.out.println("Ride from "+ub.getpLocation()+" to "+ub.getdLocation());
		   totalBill=price*km;
		   System.out.println("Bill:- "+price+" * "+km+" km");
		   System.out.println("Toatal bill is :"+totalBill);
		   System.out.println("--------------------------------");
	   }
	   
	  
}
