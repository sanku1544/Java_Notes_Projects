package com.tka.Nov14;

public class Test {

	public static void main(String[] args) {
		Student s1=new Student(2,"Sanket",56.5f);
		int r=s1.getRoll();
		System.out.println(r);
		s1.setRoll(5);
		String n=s1.getName();
		System.out.println(n);
		s1.setName("Nikam");
		float m=s1.getMarks();
		System.out.println(m);
		s1.setMarks(89.2f);
		System.out.println("-----------Updated values-----------");
		System.out.println(s1.getRoll());
		System.out.println(s1.getName());
		System.out.println(s1.getMarks());
		
		
	}

}
