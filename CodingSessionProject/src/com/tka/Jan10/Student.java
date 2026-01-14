package com.tka.Jan10;

import java.util.Scanner;

public class Student {
		private int roll;
		private String name;
		private float percentage;
		public Student() {
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter roll no: ");
			this.roll=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter Name: ");
			this.name=sc.nextLine();
			System.out.println("Enter percentage: ");
			this.percentage=sc.nextFloat();
		}
		public Student(int roll, String name, float percentage) {
			super();
			this.roll = roll;
			this.name = name;
			this.percentage = percentage;
		}
		 
		public int getRoll() {
			return roll;
		}

		public void setRoll(int roll) {
			this.roll = roll;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public float getPercentage() {
			return percentage;
		}

		public void setPercentage(float percentage) {
			this.percentage = percentage;
		}

		void display() {
			System.out.println("Student roll no: "+roll);
			System.out.println("Student name: "+name);
			System.out.println("Student percentage: "+percentage+"%");
		}
		
}
