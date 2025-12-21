package cmo.tka.Services;

import java.util.ArrayList;
import java.util.List;

import com.rtka.database.Database;
import com.tka.players.Players;

public class IPLServices {

	Database db = new Database();

	public List<Players> getPlayers(String teamn) {
		List<Players> motuList = db.getAllPlayers();
		List<Players> chotuList = new ArrayList<Players>();

		for (Players p : motuList) {
			if (p.getTname().equalsIgnoreCase(teamn)) {
				chotuList.add(p);
			}
		}
		return chotuList;

	}

	public List<Players> getPlyersByCountry(String cname) {
		List<Players> motuList = db.getAllPlayers();
		List<Players> chotuList = new ArrayList<Players>();

		for (Players p : motuList) {
			if (p.getCname().equalsIgnoreCase(cname)) {
				chotuList.add(p);
			}
		}
		return chotuList;
	}

	public List<Players> getPlyersByHighestRuns(int run) {
		List<Players> motuList = db.getAllPlayers();
		List<Players> chotuList = new ArrayList<Players>();

		for (Players p : motuList) {
			if (p.getRuns() > run) {
				chotuList.add(p);
			}
		}
		return chotuList;
	}

	public List<Players> getPlyersTotalRuns() {
		int totalRuns = 0;
		List<Players> motuList = db.getAllPlayers();
		List<Players> chotuList = new ArrayList<Players>();

		for (Players p : motuList) {
			totalRuns = totalRuns + p.getRuns();

		}
		System.out.println("Total runs: " + totalRuns);
		return chotuList;
	}

	public List<Players> getPlyersStartWith(String n) {

		List<Players> motuList = db.getAllPlayers();
		List<Players> chotuList = new ArrayList<Players>();

		for (Players p : motuList) {
			if (p.getName().startsWith(n)) {
				chotuList.add(p);
			}
		}

		return chotuList;
	}
}
