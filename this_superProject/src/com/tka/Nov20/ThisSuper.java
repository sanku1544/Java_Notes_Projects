package com.tka.Nov20;

public class ThisSuper {
	ThisSuper(){
        
        System.out.println("Zero parameterise constructor");
    }
    ThisSuper(int k){
        this(k,"Sanket");
        System.out.println("One Parameter "+k);
    }
    ThisSuper(int n, String na){
        this();
        System.out.println("Two parameter "+n+" "+na);
    }
}
