package com.tka.Dec11;
import java.util.Scanner;

public class ExceptionH {
    void exceptionHandling() {
    
    	System.out.println(7/7);
    	String name="Sanket";
    	String s[]= {"Sanket","Atul","Krushna","Jagdish","Harish"};
   	
    	
    	try {
    		
    		System.out.println(7/0);
    		
    	}catch(ArithmeticException e){
    		e.printStackTrace();
    		System.out.println("Exception "+e.getMessage());
    	}
    	try {
    		System.out.println(name.charAt(55));
    	
    	}catch(StringIndexOutOfBoundsException e) {
    		
    		System.out.println(e);
    		System.out.println("\n"+e.getMessage());
    	}
    	try{
    		
    		System.out.println(s[6]);
    	}catch(ArrayIndexOutOfBoundsException e) {
    		e.printStackTrace();
    		System.out.println("\n"+e.getMessage());
    	}
    	
    	
    	
    }
    void m2() {
    	Scanner  sc=new Scanner(System.in);
		System.out.println("Enter any no: ");
		try {
		int n=sc.nextInt();
		System.out.println("Number is:"+n);
		}
		catch(Exception e) {
			
			System.out.println("\n"+e);
			System.out.println("Message is: "+e.getMessage());
		}
    }
}
