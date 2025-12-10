package com.tka.Student;

public class Student {
	private String name;
	private int roll;
	private Long mobile;
	private String course;
	private static  String clgName;
	public Student(String name, int roll, Long mobile, String course,String clg) {
		super();
		this.name = name;
		this.roll = roll;
		this.mobile = mobile;
		this.course = course;
		clgName=clg;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public Long getMobile() {
		return mobile;
	}
	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getCollege() {
		return clgName;
	}
	public void setCollege(String clg) {
		this.clgName = clg;
	}
	
}
