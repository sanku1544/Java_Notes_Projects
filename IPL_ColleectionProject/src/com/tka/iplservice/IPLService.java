package com.tka.iplservice;

import java.util.List;
import java.util.stream.Collectors;

import com.tka.entity.Player;
import com.tka.iplrepository.IPLRepository;

public class IPLService {
	
	IPLRepository iplrepository = null;

	public List<Player> getAllPlayer() {
		//System.out.println("Welcome to IPL Service Module");

		iplrepository = new IPLRepository();
		List<Player> allplayers = iplrepository.getAllPlayer();
		
		return allplayers;
	}

	public List<Player> getPlayerByTname(String tname) {
		return this.getAllPlayer().stream().filter(m->m.getTname().equalsIgnoreCase(tname)).collect(Collectors.toList());
	}

	public List<Player> getByName(String name) {
		return this.getAllPlayer().stream().filter(m->m.getName().equalsIgnoreCase(name)).collect(Collectors.toList());
		
	}

	public List<Player> startWith(String n) {
		return this.getAllPlayer().stream().filter(m->m.getName().startsWith(n)).collect(Collectors.toList());
	}

	public int getHighestWicketTaker() {
	    return this.getAllPlayer().stream().map(Player::getWickets).reduce(0, Integer::max);
	}
         

	public List<Player> AllRounders(int i, int j) {
		return this.getAllPlayer().stream().filter(m->m.getRuns()>i && m.getWickets()>j).collect(Collectors.toList());
	}

	public int getHighestRunner() {
	    return this.getAllPlayer().stream().map(Player::getRuns).reduce(0, Integer::max);

		
	}

}
