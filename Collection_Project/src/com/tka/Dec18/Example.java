package com.tka.Dec18;

import java.util.ArrayList;
import java.util.List;


public class Example {

	public static void main(String[] args) {
		List<Integer> salaryList= new ArrayList<Integer>();
		
		salaryList.add(10020);
		salaryList.add(20000);
		salaryList.add(55000);
		//salaryList.add("Sanket Nikam");

		
		System.out.println("Salary list:- "+salaryList);
		
		
		for(int i=0;i<salaryList.size();i++) {
			if(salaryList.get(i)<25000) {
			System.out.println(salaryList.get(i));
			salaryList.set(i,salaryList.get(i)+5000);
			}
		}
		System.out.println("Updated list :- "+salaryList);

		for(int i:salaryList) {
			if(i<25000) {
			System.out.println("Below 25000 salary:- "+i);
			
			}
		}
		
}
}
