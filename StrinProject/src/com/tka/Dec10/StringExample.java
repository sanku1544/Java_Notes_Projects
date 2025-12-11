package com.tka.Dec10;

public class StringExample {
		void m1() {
			String s="Sanket";
			 
			 String rev="";
			 System.out.println("String is:- "+s);
			 for(int i=0;i<s.length();i++) {
				 System.out.println(i+" = "+s.charAt(i));
				 rev=s.charAt(i)+rev;
				 

			 }
			 System.out.println("Reverse string is: "+rev);
			 System.out.println("-------------------------------");
			 for(int i=0;i<s.length();i++) {
				 if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='a' ) {
					 System.out.println("Ovwels of String: "+s.charAt(i));
				 }
//				 System.out.println(i+" = "+s.charAt(i));
			 }
			 
			 StringBuilder n=new StringBuilder("Nikam");
			 for(int i=0;i<s.length();i++) {
				 System.out.println(n.append(s.charAt(i)));
				
		}
		}
		void operations() {
			String s="Sanket";
			String []name_db= {"Rahul","Rohit","Suresh","Ramesh","Rajesh","Ritik","Ranjan"};
			int count=0;
			
//			for(String name:name_db) {
//				if(name.startsWith("Ra")) {
//					count++;
//				}
//				if(name.endsWith("sh")) {
//					count++;
//				}
//			}
			//System.out.println(count);
			
//			for(String name:name_db) {
//				
//				if(name.contains("h")) {
//					count++;
//				}
//			}
//			System.out.println(count);
//			
			for(String name:name_db) {
				
				if(name.contains("h") && name.contains("e")) {
					count++;
				}
			}
			System.out.println(count);
					 
			
		}
		
}
