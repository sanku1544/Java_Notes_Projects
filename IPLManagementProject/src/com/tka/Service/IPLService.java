package com.tka.Service;

import java.util.ArrayList;
import java.util.List;

import com.tka.Database.Database;
import com.tka.PlayerDetails.Player;

public class IPLService {
	Database db = new Database();
	
	public List<Player> getPlayers(int runs){
		System.out.println("Getting players by runs: ");
		List<Player> motuList=db.getAllPlayers();
		List<Player> chotuList=new ArrayList<Player>();
		
		for(Player p:motuList) {
			if(p.getRuns()>runs) {
				chotuList.add(p);
			}
		}
		return chotuList;
	}
	public List<Player> getPlayers(String tname){
		List<Player> motuList=db.getAllPlayers();
		List<Player> chotuList=new ArrayList<Player>();
		for(Player p:motuList) {
			if(p.getTname().equalsIgnoreCase(tname)) {
				chotuList.add(p);
			}
		}
		return chotuList;
	}
}
