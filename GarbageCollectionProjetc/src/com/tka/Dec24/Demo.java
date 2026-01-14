package com.tka.Dec24;

public class Demo extends Object{
	private int eid;
	private String ename;
	private int esalary;
	public Demo(int eid, String ename, int esalary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esalary = esalary;
	}
	
	void display() {
		System.out.println("Employee id: "+eid);
		System.out.println("Employee name: "+ename);
		System.out.println("Employee salary: "+esalary);
	}
	@Override
	public void finalize() {
		System.out.println("Clear unwanted heap memory ");
	}
}
