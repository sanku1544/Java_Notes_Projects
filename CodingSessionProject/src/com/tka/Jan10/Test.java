package com.tka.Jan10;

import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter size: ");
		int size=sc.nextInt();
		Student []s1=new Student[size];
		for(int i=0;i<s1.length;i++) {
			s1[i]=new Student();
		}
		for(Student s:s1) {
			s.display();
		}
	}

}
