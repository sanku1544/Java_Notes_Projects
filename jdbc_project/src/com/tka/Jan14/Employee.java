package com.tka.Jan14;

public class Employee {
	private int E_id;
	private String E_name;
	private int E_age;
	private String E_dept;
	private int E_sal;
	private String E_Date_of_Joining;
	public Employee() {
		super();
	}
	public Employee(int id, String name, int age, String dept, int sal, String date) {
		super();
		this.E_id=id;
		this.E_name=name;
		this.E_age=age;
		this.E_dept=dept;
		this.E_sal=sal;
		this.E_Date_of_Joining=date;
	}
	public int getE_id() {
		return E_id;
	}
	public void setE_id(int e_id) { 
		E_id = e_id;
	}
	public String getE_name() {
		return E_name;
	}
	public void setE_name(String e_name) {
		E_name = e_name;
	}
	public int getE_age() {
		return E_age;
	}
	public void setE_age(int e_age) {
		E_age = e_age;
	}
	public String getE_dept() {
		return E_dept;
	}
	public void setE_dept(String e_dept) {
		E_dept = e_dept;
	}
	public int getE_sal() {
		return E_sal;
	}
	public void setE_sal(int e_sal) {
		E_sal = e_sal;
	}
	public String getE_Date_of_Joining() {
		return E_Date_of_Joining;
	}
	public void setE_Date_of_Joining(String e_Date_of_Joining) {
		E_Date_of_Joining = e_Date_of_Joining;
	}
	@Override
	public String toString() {
		return "Employee [E_id=" + E_id + ", E_name=" + E_name + ", E_dept=" + E_dept + "]";
	}
	
	
}
