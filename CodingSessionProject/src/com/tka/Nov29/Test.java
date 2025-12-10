package com.tka.Nov29;
import java.util.*;
public class Test {
	void Hotel() {
		Scanner sc=new Scanner(System.in);
		System.out.println("--------------Customer Details--------------");
		System.out.println("Enter Name of customer: ");
		String name=sc.nextLine();
		System.out.println("Enter stay days: ");
		int s=sc.nextInt();
		
		
		
		Hotel h1=new Hotel(name,s,500);
		System.out.println("Select Non-A/C room for 1000 enter 1:");
		 System.out.println("Select A/C room for 1500 enter 2:");
		 System.out.println("Select  Delux for 3000 enter 3:");
		 System.out.println("Choose any room: ");
		 int c=sc.nextInt();	
		 
		 
			h1.Choose(c);
			if(c<=3) {
			h1.TotalAmout();

			sc.nextLine();
			System.out.println("--------------Payment Details--------------");
		 System.out.println("\nEnter UPI or Mobile no for payment: ");
		 String ch=sc.nextLine();		
		 h1.Payment(ch);
			}
			
		}
	void Student() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Student Details: ");
		System.out.println("Enter Student Name: ");
		String sname=sc.nextLine();
		
		System.out.println("Enter  Student PCB marks: ");
		int physics=sc.nextInt();
		int chemistry=sc.nextInt();
		int bio=sc.nextInt();
		
		Session s1= new Session();
		s1.Student(sname);
		s1.PCB(physics,chemistry,bio);
	}
	
	
	public static void main(String[] args) {
		Test t1=new Test();
		t1.Hotel();
		//t1.Student();
		
		

	}

}







