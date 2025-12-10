package com.tka.Nov10;

public class Constructor {
    int roll;
    String name;
    Constructor(){
    	System.out.println(roll+" "+name);
    }
    Constructor(int n){
    	roll=n;
    	System.out.println(roll);
    }
    Constructor(int n, String s){
    	roll=n;
    	name=s;
    	System.out.println(roll+" "+name);
    }
    void m1() {
    	System.out.println("------------------------------");
    }
}
