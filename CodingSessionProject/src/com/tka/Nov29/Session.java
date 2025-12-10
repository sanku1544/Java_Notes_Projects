package com.tka.Nov29;

public class Session {
	String sname;
	int physics;
	int chemistry;
	int bio;
	int total;
	float per;
		void Student(String n) {
			 this.sname=n;
			
		}
		void PCB(int a, int b, int d) {
			physics=a;
			chemistry=b;
			bio=d;
		 total= physics+chemistry+bio;
		 per=total/3;
		 
		 
		 System.out.println("Physics Marks: "+physics);
		 System.out.println("Chemistry Marks: "+chemistry);
		 System.out.println("Bio Marks: "+bio+"\n");
			if(physics<35) {
				System.out.println("You are Fail in Physics: "+physics+"\n");
			}
			else {
				System.out.println("Congrats you are Pass in Physics: \n");
			}
			
			if(chemistry<35) {
				System.out.println("You are Fail in Chemestry: "+chemistry+"\n");
			}
			else {
				System.out.println("Congrats you are Pass in Chemistry: \n");
			}
			
			if(bio<35) {
				System.out.println("You are Fail in Bio: "+bio+"\n");
			}
			else {
				System.out.println("Congrats you are Pass in Bio: \n");
			}
			System.out.println("-----------Result is:---------- \n");
			System.out.println("Student Name: "+sname);
			System.out.println("Total Marks: "+total+" out of 300");
			System.out.println("Percentage is: "+per+"%");
		}
		
		
		
		 
		

	}


