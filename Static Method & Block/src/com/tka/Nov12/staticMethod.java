package com.tka.Nov12;

public class staticMethod {
     int roll=0;
     {
    	 System.out.println("Welcome block");
     }
     static {
    	 System.out.println("Static block");
     }
     
     static void m1(int n) {
    	System.out.println(5+5);
//    	staticMethod m1=new staticMethod();
//    	m1.m2();// calling not static method
     }
     void m2() {
    	 System.out.println("Non static method");
    	 staticMethod.m1(5); // calling static method
     }
     staticMethod(){
    	 System.out.println("Constructor");
     }
}
