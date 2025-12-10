package com.tka.Dec8;

public class Player {
   private int jn;
   private String name;
   private int runs;
   private static String tname;
   private int wickets;
   public Player(int jn, String name, int runs,int wickets) {
	super();
	this.jn = jn;
	this.name = name;
	this.runs = runs;
	this.wickets=wickets;
	
   }
   public int getJn() {
	return jn;
   }
   public void setJn(int jn) {
	this.jn = jn;
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
   public int getWickets() {
	return wickets;
   }
   public void setWickets(int wickets) {
	this.wickets = wickets;
   }
   public static String getTname() {
	return tname;
   }
   public static void setTname(String tname) {
	Player.tname = tname;
   }
   @Override
   public String toString() {
	return "Player [jn=" + jn + ", name=" + name + ", runs=" + runs + ", wickets=" + wickets + "]";
   }
   
  
   
}
