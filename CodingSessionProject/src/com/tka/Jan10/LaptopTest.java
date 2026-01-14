package com.tka.Jan10;

import java.util.Scanner;



public class LaptopTest {

	public static void main(String[] args) {
		int max=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter size: ");
		int size=sc.nextInt();
		
		Laptop []l2=new Laptop[size];
		for(int i=0;i<l2.length;i++) {
			Laptop l3=new Laptop();
			l2[i]=l3;
		}
		for(int i=0;i<l2.length;i++) {
			if(max<l2[i].getCost()) {
				max=l2[i].getCost();
			}
			
		}
		for(int i=0;i<l2.length;i++) {
			if(max==l2[i].getCost()) {
				l2[i].diplay();
			}
		}
	}

}
