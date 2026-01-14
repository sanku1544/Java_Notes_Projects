package com.tka.iplcontroller;

import java.util.List;

import com.tka.entity.Player;
import com.tka.iplservice.IPLService;

public class IPLController {

	IPLService iplservice = null;

	public List<Player> getAllPlayers() {
		System.out.println("Welcome to IPL Controller Module");

		iplservice = new IPLService();
		List<Player> allplayers = iplservice.getAllPlayer();

		return allplayers;
	}

	public List<Player> getPlayerByTname(String tname) {
		
		iplservice=new IPLService();
		
		List<Player> allplayers=iplservice.getPlayerByTname(tname);
		
		return allplayers;
	}

	public List<Player> getByName(String name) {
			
		iplservice=new IPLService();
		List<Player> allplayers=iplservice.getByName(name);
		return allplayers;
	}

	public List<Player> startWith(String n) {
		
		iplservice=new IPLService();
		List<Player> allplayers=iplservice.startWith(n);
		return allplayers;
		
		
	}

	public int getHighestWicketTaker() {
		
		iplservice=new IPLService();
		int allplayers=iplservice.getHighestWicketTaker();
		return allplayers;
	}

	public List<Player> AllRounders(int i, int j) {
		
		iplservice=new IPLService();
		List<Player> allplayers=iplservice.AllRounders(i,j);
		return allplayers;
		
	}

	public int getHighestRunner() {
		iplservice=new IPLService();
		int allplayers=iplservice.getHighestRunner();
		return allplayers;
	}

}
