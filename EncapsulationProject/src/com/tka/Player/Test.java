package com.tka.Player;

public class Test {

	public static void main(String[] args) {
		Player p1=new Player(5,"Sanket",45,"MI");
		int j=p1.getJerseyNo();
		System.out.println(j);
		p1.setJerseyNo(7);
		String n=p1.getName();
		System.out.println(n);
		p1.setName("Virat");
		int r=p1.getRuns();
		System.out.println(r);
		p1.setRuns(75);
		String t=p1.getTeamName();
		System.out.println(t);
		p1.setTeamName("RCB");
		System.out.println("--------------------Updated Values--------------------");
		int j1=p1.getJerseyNo();
		System.out.println(j1);
		String n1=p1.getName();
		System.out.println(n1);
		int r1=p1.getRuns();
		System.out.println(r1);
		String t1=p1.getTeamName();
		System.out.println(t1);

	}

}
