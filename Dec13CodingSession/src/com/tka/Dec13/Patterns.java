package com.tka.Dec13;

public class Patterns {
  void Pattern57() {
	  int n=3;
	  for(int i=1;i<=n;i++) {
		  for(int j=1;j<=i;j++) {
			  System.out.print(j);
		  }
		  System.out.println();
	  }
  }
  void Pattern58() {
	  
	  for(int i=1;i<=5;i++) {
		  for(int j=1;j<=5;j++) {
			  System.out.print(i);
		  }
		  System.out.println();
	  }
  }
  void Pattern59() {
	  
	  for(int i=1;i<=5;i++) {
		  for(int j=1;j<=i;j++) {
			  System.out.print(j);
		  }
		  System.out.println();
	  }
  }
  void Pattern60() {
	  int a=1;
	  for(int i=1;i<=3;i++) {
		  for(int j=1;j<=i;j++) {
			  System.out.print(a+"");
			  a++;
			 
		  }
		  System.out.println();
	  }
  }
  void Pattern61() {
	  
	  for(int i=1;i<=3;i++) {
		  for(int j=1;j<=4;j++) {
			  if(i%2==0) {
			  System.out.print("*");
			  }else {
				  System.out.print("#");
			  }
			  			  
		  }
		  System.out.println();
	  }
  }
  void Pattern62() {
	  
	  for(int i=1;i<=3;i++) {
		  for(int j=1;j<=5;j++) {
			  if(i%2!=0 ) {
			  System.out.print("#");
			  }else if(j==1 || j==5) {
				  System.out.print("#");
			  }
			  else {
				  System.out.print("*");
			  }
			  
		  }
		  System.out.println();
	  }
  }
  void Pattern63() {
	 
	  for(int i=1;i<=5;i++) {
		  int a=65;
		  for(int j=i;j<=5;j++) {
			  char ch=(char)+a;
			  System.out.print(ch);
			  a++;
		  }
		  System.out.println();
	  }
  }
  void Pattern64() {
	  int n=3;
	  for(int i=1;i<=n;i++) {
		  System.out.print("KiranAcademy ");
		  for(int j=1;j<=i;j++) {
			  System.out.print("* ");  
		  }
		  System.out.println();
	  }
	  for(int i=1;i<n;i++) {  
		  System.out.print("KiranAcademy ");
		  for(int j=i;j<n;j++) {
			  
			  System.out.print("* ");
			  
		  }
		  System.out.println();
	  }
  }
  void Pattern65() {
	  for(int i=1;i<=5;i++) {
		  for(int j=1;j<=5;j++) {
			  if(i==1 || i==5) {
			  System.out.print("#");
			  }else if(j==1 || j==5 ) {
				  System.out.print("#");
			  }
			  else {
				  System.out.print("*");
			  }
			  
		  }
		  System.out.println();
	  }
  }
  void Pattern66() {
	  for(int i=1;i<=5;i++) {
		  for(int j=1;j<=5;j++) {
			  if(i==1 || j==3) {
				  System.out.print("* ");
			  }else  {
				  System.out.print("  ");
			  }
		  }
		  System.out.println();
	  }
   
  }
  void Pattern67() {
	  for(int i=1;i<=5;i++) {
		  for(int j=i;j<=5;j++) {
			  System.out.print(j);
		  }
		  System.out.println();
	  }
	  
  }
  void Pattern68() {
	  
	  for(int i=1;i<=3;i++) {
		  int n=200;
		  for(int j=1;j<=5;j++) {
			if(i==1) {
			  System.out.print(n+" ");
			  n=n+200;
			}else if(i==2) {
				n=n+100;
				System.out.print(n+" ");
				  n=n+200;
			}
			else {
				n=n+200;
				System.out.print(n+" ");
				  n=n+200;
				
			}
		  }
		  System.out.println();
	  }
	  
  }
}
