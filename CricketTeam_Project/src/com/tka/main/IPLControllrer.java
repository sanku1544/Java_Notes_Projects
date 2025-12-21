package com.tka.main;

import java.util.List;

import com.tka.players.Players;

import cmo.tka.Services.IPLServices;

public class IPLControllrer {

	public static void main(String[] args) {
		IPLServices ip= new IPLServices();
		
		List<Players> player1=ip.getPlayers("mi");
		List<Players> player2=ip.getPlyersByCountry("South Africa");
		List<Players> player3=ip.getPlyersByHighestRuns(4200);
		List<Players> player4=ip.getPlyersTotalRuns();
		System.out.println("\nMi team players: ");
		for(Players p:player1) {
			System.out.println(p.getName()+" : "+p.getCname());
		}
		
		System.out.println("\nSA players: ");
		for(Players p1:player2) {
			System.out.println(p1.getName()+" :- "+p1.getCname());
		}
		System.out.println("\nPlayer runs greater than 4200 : ");
		for(Players p1:player3) {
			System.out.println(p1.getJn()+" :- "+ p1.getName()+" :- "+p1.getCname());
		}
		

	}

}
