package com.tka.Jan10;

import java.util.Scanner;

public class Laptop {
	private int mno;
	private String name;
	private int cost;
	public Laptop() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter laptop model no: ");
		this.mno=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter laptop name: ");
		this.name=sc.nextLine();
		System.out.println("Enter laptop price: ");
		this.cost=sc.nextInt();
	}
	public Laptop(int mno, String name, int cost) {
		super();
		this.mno = mno;
		this.name = name;
		this.cost = cost;
	}
	
	public int getMno() {
		return mno;
	}
	public void setMno(int mno) {
		this.mno = mno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	void diplay() {
		System.out.println("Laptop model no: "+mno);
		System.out.println("Laptop name: "+name);
		System.out.println("Laptop price: "+cost);
	}
	
}
