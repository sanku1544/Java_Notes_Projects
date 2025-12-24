package com.tka.iplservice;

import java.util.ArrayList;
import java.util.List;

import com.tka.entity.Player;
import com.tka.iplrepository.IPLRepository;

public class IPLService {
	
	IPLRepository iplrepository = null;

	public List<Player> getAllPlayer() {
		System.out.println("Welcome to IPL Service Module");

		iplrepository = new IPLRepository();
		List<Player> allplayers = iplrepository.getAllPlayer();
		
		return allplayers;
	}

	public List<Player> getPlayerByTname(String tname) {
		List<Player> playerbytname=new ArrayList();
		
		iplrepository = new IPLRepository();
		List<Player> allplayers=this.getAllPlayer();
		for(Player p:allplayers) {
			if(p.getTname().equalsIgnoreCase(tname)) {
			playerbytname.add(p);
			}
		}
		
		return playerbytname;
	}

	public List<Player> getByName(String name) {
		List<Player> playerbyname=new ArrayList();
		
		iplrepository = new IPLRepository();
		List<Player> allplayers=this.getAllPlayer();
		for(Player p:allplayers) {
			if(p.getName().equalsIgnoreCase(name)) {
				playerbyname.add(p);
			}
		}
		return playerbyname;
	}

	public List<Player> startWith(String n) {
		List<Player> startwith=new ArrayList();
		
		iplrepository = new IPLRepository();
		List<Player> allplayers=this.getAllPlayer();
		for(Player p:allplayers) {
			if(p.getName().startsWith(n)) {
			startwith.add(p);
			}
		}
		return startwith;
	}

	public int getHighestWicketTaker() {
		
		int mwk=0;
		List<Player> allplayers=this.getAllPlayer();
		for(Player p:allplayers) {
			if(p.getWickets()>mwk) {
				mwk=p.getWickets();			}
		}
		return mwk;
	}

	public List<Player> AllRounders(int i, int j) {
		List<Player> allrounder=new ArrayList();
		
		iplrepository=new IPLRepository();
		List<Player> allplayers=this.getAllPlayer();
		for(Player p:allplayers) {
			if(p.getRuns()>i && p.getWickets()>j) {
				allrounder.add(p);
			}
		}
		return allrounder;
	}

	public int getHighestRunner() {
		int hrunner=0;
		List<Player> allplayers=this.getAllPlayer();
		for(Player p:allplayers) {
			if(p.getRuns()>hrunner) {
				hrunner=p.getRuns();			}
		}
		return hrunner;
	}

}
