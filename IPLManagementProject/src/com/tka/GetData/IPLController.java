package com.tka.GetData;

import java.util.ArrayList;
import java.util.List;

import com.tka.Database.Database;
import com.tka.PlayerDetails.Player;
import com.tka.Service.IPLService;

public class IPLController {
	public static void main(String []args) {
		
		IPLService service = new IPLService();
		
		List<Player> ch=service.getPlayers(4500);
		
		System.out.println("Playe with runs: ");
		for(Player p:ch) {
			System.out.println(p.getPname()+" :- "+p.getRuns());
		}
		List<Player> cskPlayers = service.getPlayers("CSK");
		
		System.out.println("\nCSk Team players: ");
        for (Player p : cskPlayers) {
            System.out.println(p.getPname());
        }
	}
}
 