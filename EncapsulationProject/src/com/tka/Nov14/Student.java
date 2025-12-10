package com.tka.Nov14;

public class Student {
	private int roll;
	private String name;
	private float marks;
	Student(int r,String n,float m){
		roll=r;
		name=n;
		marks=m;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int nr) {
		roll=nr;
	}
	public String getName() {
		return name;
	}
	public void setName(String nn) {
		name=nn;
	}
	public float getMarks() {
		return marks;
	}
	public void setMarks(float nm) {
		marks=nm;
	}
}
