package com.tka.ipluser;

import java.util.List;

import com.tka.entity.Player;
import com.tka.iplcontroller.IPLController;

public class IPLUser {
	public static void main(String[] args) {
		System.out.println("Welcome to IPL User Module");
		System.out.println("------------------All Players----------------------------");
		IPLController controller = new IPLController();
		List<Player> allplayers = controller.getAllPlayers();
		allplayers.forEach(n->System.out.println(n.getName()));
		System.out.println("-----------------------By Team Name-----------------------");
		List<Player> allplayers1=controller.getPlayerByTname("csk");
		allplayers1.forEach(n->System.out.println(n.getName()));
		System.out.println("----------------------By Player Name------------------------");
		List<Player> allplayers2=controller.getByName("rohit sharma");
		allplayers2.forEach(n->System.out.println(n.getName()+" Tname: "+n.getTname()+" Runs: "+n.getRuns()));
		System.out.println("----------------------StatWith------------------------");
		List<Player> allplayers3=controller.startWith("Vi");
		allplayers3.forEach(n->System.out.println(n.getName()+" Tname: "+n.getTname()+" Runs: "+n.getRuns()));
		System.out.println("-------------------HighestWicketTacker---------------------------");
		int allplayers4=controller.getHighestWicketTaker();
		for(Player p:allplayers) {
			if(p.getWickets()==allplayers4) {
				
				System.out.println("HighestWicket tacker: "+p.getName()+" Wickets: "+p.getRuns()+" Tname: "+p.getTname());
			}
		}
		System.out.println("-------------------Allrounders---------------------------");
		List<Player> allplayers5=controller.AllRounders(500,18);
		allplayers5.forEach(n->System.out.println(n.getName()+" Tname: "+n.getTname()+" Runs: "+n.getRuns()));
		System.out.println("-------------------Highest Runner---------------------------");
		int allplayers6=controller.getHighestRunner(); 
		for(Player p:allplayers) {
			if(p.getRuns()==allplayers6) {
				
				System.out.println("Higest runner: "+p.getName()+" Runs: "+p.getRuns()+" Tname: "+p.getTname());
			}
		}

	}
}
