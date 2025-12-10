package com.tka.Multilevel;

public class A {
	protected int age;
   public void m1() {
	   System.out.println("Calling GrandParent");
   }
   protected void age(int a) {
	   age=a;
	   System.out.println(age);
   }
   
  
   A(int n,String g){
	   System.out.println(n+" "+g);
   }
}
