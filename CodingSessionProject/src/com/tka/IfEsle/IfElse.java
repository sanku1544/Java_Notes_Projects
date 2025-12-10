package com.tka.IfEsle;

public class IfElse {
  void evenOdd(int a) {
	  if(a%2==0) {
		  System.out.println("Even no");
	  }
	  else{
		 System.out.println("Odd no "); 
	  }
  }
  void zeroPosNeg(int a) {
	  if(a>0) {
		  System.out.println("Positive ");
	  }
	  else if(a<0) {
		  System.out.println("Negative ");
	  }
	  else {
		  System.out.println("Zero ");
	  }
  }
  void small(int a, int b) {
	  if(a>b) {
		  System.out.println("Smallest no. is "+b);
	  }else {
		  System.out.println("Smallest no. is "+a);
	  }
	  
  }
  void big(int a, int b, int c) {
	  if(a>b) {
		  if(a>c) {
			  System.out.println("A is Big "+a);
		  }else {
			  System.out.println("C is Big "+c);
		  }
	  }else if(b>c) {
		  System.out.println("B is Big "+b);
	  }else {
		  System.out.println("C is Big "+c);
	  }
  }
 
   void leapYear(int a) {
	  if(a%4==0) {
		  System.out.println("Leap Year");
	  }else {
		  System.out.println("Not Leap year");
	  }
	
  }
   
   void week(int a) {
	   switch(a) {
	   case 1:System.out.println("Monday");
	   break;
	   case 2:System.out.println("Tuesday");
	   break;
	   case 3:System.out.println("Wednsday");
	   break;
	   case 4:System.out.println("Thusday");
	   break;
	   case 5:System.out.println("Friday");
	   break;
	   case 6:System.out.println("Saturday");
	   break;
	   case 7:System.out.println("Sunday");
	   break;
	   default:System.out.println("Enter no between 1 to 7 ");
	   }
   }
   void check(char c) {
	   if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u') {
		   System.out.println("Character is Ovwel");
	   }
	   else {
		   System.out.println("Character is Consonant ");
	   }
   }
   void sqrRoot(int a) {
	   System.out.println(Math.sqrt(a));
   }
   void cubeRoot(int a) {
	   System.out.println(Math.cbrt(a));
   }

   
   void simpleIntrest(int principle, int intrest, int time) {
	   int i=principle*intrest*time;
	   int a=i/100;
	   System.out.println("Simple Intrest is: "+a);
   }
   void km(int a) {
	   int meters=a*1000;
	   System.out.println("Meters is: "+meters);
	   int centimeter= meters*100;
	   System.out.println("Centermeters is: "+centimeter);
	   int mili=centimeter*10;
	   System.out.println("Millimeters is: "+mili);
   }
   void days(int a) {
	   float year=a/365;
	   System.out.println("Years are: "+year);
	   float week=a/7;
	   System.out.println("Weeks are: "+week);
	   System.out.println("Days are: "+a);
   }
   void hours(int h) {
	   int min=h*60;
	   System.out.println("Minutes are: "+min);
	   int sec=min*60;
	   System.out.println("Seconds are: "+sec);
   }
//   void countString(String s) {
//	   for(int i=1;i<=s.length();i++) {
//		   System.out.println(i);
//	   } }
   
}
