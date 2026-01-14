package com.tka.Jan10;


public class Employee {
	private int eid;
	private String name;
	private int age;
	private int salary;
	
	
	public Employee(int eid, String name, int age, int salary) {
		super();
		this.eid = eid;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	void display() {
		System.out.println("Employee id: "+eid);
		System.out.println("Employee name: "+name);
		System.out.println("Employee age: "+age);
		System.out.println("Employee salary: "+salary);
		
	}
	
	
	

	
	
}
