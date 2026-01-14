package com.tka.Jan10;

public class Mobile {
	private Long  m_no;
	private String mname;
	private int cost;
	public Mobile(Long m_no, String mname, int cost) {
		super();
		this.m_no = m_no;
		this.mname = mname;
		this.cost = cost;
	}
	public Long getM_no() {
		return m_no;
	}
	public void setM_no(Long m_no) {
		this.m_no = m_no;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	void display() {
		System.out.println("Model no: "+m_no);
		System.out.println("Mobile  name: "+mname);
		System.out.println("Mobile cost: "+cost);
	}
}
