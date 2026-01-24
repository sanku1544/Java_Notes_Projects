package com.tka.Jan15;

public class Player {
 private int jn;
 private String pname;
 private int runs;
 private int wickets;
 private  String tname;
 private String cname;
 public Player() {
	// TODO Auto-generated constructor stub
}
 public Player(int jn2, String name, int runs2, int wk, String tname, String cname2) {
	this.jn=jn;
	this.pname=name;
	this.runs=runs2;
	this.wickets=wk; 
	this.tname=tname;
	this.cname=cname2;
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
 public int getWickets() {
	return wickets;
 }
 public void setWickets(int wickets) {
	this.wickets = wickets;
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
	return "Player [jn=" + jn + ", pname=" + pname + ", wickets=" + wickets + ", tname=" + tname + "]";
 }
 
 
 
}
