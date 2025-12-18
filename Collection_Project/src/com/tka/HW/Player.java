package com.tka.HW;

public class Player {
	private int jn;
	private String pname;
	private int runs;
	private int wickects;
	private String tname;
	public Player(int jn, String pname, int runs, int wickects, String tname) {
		super();
		this.jn = jn;
		this.pname = pname;
		this.runs = runs;
		this.wickects = wickects;
		this.tname = tname;
	}
	public int getJn() {
		return jn;
	}
	public void setJn(int jn) {
		this.jn = jn;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getRuns() {
		return runs;
	}
	public void setRuns(int runs) {
		this.runs = runs;
	}
	public int getWickects() {
		return wickects;
	}
	public void setWickects(int wickects) {
		this.wickects = wickects;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	
}
