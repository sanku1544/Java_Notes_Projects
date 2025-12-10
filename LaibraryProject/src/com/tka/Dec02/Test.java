package com.tka.Dec02;

public class Test {

	public static void main(String[] args) {
		//Books
	Book b1=new Book("Wings of fire","Jay","Pune","Motivation",450);
	b1.displayInfo();
	System.out.println("-------------------------------------");
	
	//EBooks
	EBook e1=new EBook("JAVA","Viru","Mumbai","PDF","1MB");
	e1.displayInfo();
	System.out.println("-------------------------------------");

	//DVD
	DVD d1=new DVD("Python","Aman","Delhi","RAM ","45min");
	d1.displayInfo();
	}

}
