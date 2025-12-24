package com.tka.ipluser;

import java.util.List;

import com.tka.entity.Player;
import com.tka.iplcontroller.IPLController;

public class IPLUser {
	public static void main(String[] args) {
		System.out.println("Welcome to IPL User Module");

		IPLController controller = new IPLController();
		List<Player> allplayers = controller.getAllPlayers();
		List<Player> allplayers1=controller.getPlayerByTname("csk");
		List<Player> allplayers2=controller.getByName("rohit sharma");
		List<Player> allplayers3=controller.startWith("Vi");
		int allplayers4=controller.getHighestWicketTaker();
		List<Player> allplayers5=controller.AllRounders(500,18);
		int allplayers6=controller.getHighestRunner();
		System.out.println("----------------------------------------------");
		for(Player p:allplayers) {
			System.out.println(p.getName());
		}
		System.out.println("----------------------------------------------");

		for(Player p:allplayers1) {
			System.out.println(p.getName());
		}
		System.out.println("----------------------------------------------");

		for(Player p:allplayers2) {
			System.out.println(p.getName()+" :- "+p.getTname()+" Runs: "+p.getRuns());
		}
		System.out.println("----------------------------------------------");

		for(Player p:allplayers3) {
			System.out.println(p.getName()+" : "+p.getTname());
		}
		System.out.println("----------------------------------------------");
		for(Player p:allplayers) {
			if(p.getWickets()==allplayers4) {
				
				System.out.println("HigestWicket tacker: "+p.getName()+" Wickets: "+p.getRuns()+" Tname: "+p.getTname());
			}
		}
		System.out.println("----------------------------------------------");
		for(Player p:allplayers5) {
			System.out.println("AllRounder: "+p.getName()+" Tname: "+p.getTname());
		}
		System.out.println("----------------------------------------------");
		for(Player p:allplayers) {
			if(p.getRuns()==allplayers6) {
				
				System.out.println("Higest runner: "+p.getName()+" Runs: "+p.getRuns()+" Tname: "+p.getTname());
			}
		}
	}
}
