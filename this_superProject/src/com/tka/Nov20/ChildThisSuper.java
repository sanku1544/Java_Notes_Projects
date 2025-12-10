package com.tka.Nov20;

public class ChildThisSuper extends  ThisSuper{
	ChildThisSuper(String s){
		super(33);
		System.out.println("Child class Constructor "+s);
	}
	ChildThisSuper(int v, String n,int f){
		this("Welcome to Child class");
		System.out.println("Roll no:- "+v+"\nName:- "+n+"\nFees:- "+f);
	}
}
