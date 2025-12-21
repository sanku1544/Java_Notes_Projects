package com.tka.Players;

public class Players {
	private int Jn;
	private String name;
	private int runs;
	private int wk;
	private String tname;
	private String cname;
	public Players(int jn, String name, int runs, int wk, String tname, String cname) {
		super();
		Jn = jn;
		this.name = name;
		this.runs = runs;
		this.wk = wk;
		this.tname = tname;
		this.cname = cname;
	}
	public int getJn() {
		return Jn;
	}
	public void setJn(int jn) {
		Jn = jn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRuns() {
		return runs;
	}
	public void setRuns(int runs) {
		this.runs = runs;
	}
	public int getWk() {
		return wk;
	}
	public void setWk(int wk) {
		this.wk = wk;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	@Override
	public String toString() {
		return "Players [Jn=" + Jn + ", name=" + name + ", runs=" + runs + ", wk=" + wk + ", tname=" + tname
				+ ", cname=" + cname + "]";
	}
	
}
