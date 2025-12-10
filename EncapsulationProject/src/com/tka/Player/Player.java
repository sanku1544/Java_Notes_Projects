package com.tka.Player;

public class Player {
  private int jersey_no;
  private String name;
  private int runs;
  private String team_name;
  
  Player(int j,String n,int r,String t){
	  this.jersey_no=j;
	  this.name=n;
	  this.runs=r;
	  this.team_name=t;
  }
  public int getJerseyNo() {
	  return jersey_no;
  }
  public void setJerseyNo(int nj) {
	  this.jersey_no=nj;
  }
  public String getName() {
	  return name;
  }
  public void setName(String nn) {
	  this.name=nn;
  }
  public int getRuns() {
	  return runs;
  }
  public void setRuns(int nrs) {
	  this.runs=nrs;
  }
  public String getTeamName() {
	  return team_name;
  }
  public void setTeamName(String tn) {
	  this.team_name=tn;
  }
}
