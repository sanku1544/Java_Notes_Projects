package com.tka.HW;

import java.util.ArrayList;
import java.util.List;

public class MI {
	List<Player> l1 = new ArrayList<Player>();

	MI() {

		l1.add(new Player(45, "Rohit Sharma", 341, 2, "MI"));
		l1.add(new Player(12, "Tim David", 421, 3, "MI"));
		l1.add(new Player(5, "Tilak Varmaa", 541, 7, "MI"));
		l1.add(new Player(20, "Suryakumar Yadav", 442, 1, "MI"));
		l1.add(new Player(17, "Hardik Pandya", 109, 0, "MI"));
		l1.add(new Player(33, "Mitchel Santner", 121, 4, "MI"));
		l1.add(new Player(11, "Dipak Chahar", 55, 6, "MI"));
		l1.add(new Player(07, "Jasprit Bumrah", 11, 9, "MI"));
		l1.add(new Player(19, "Trent Bolt", 7400, 5, "MI"));
		l1.add(new Player(10, "Devald Bravis", 234, 0, "MI"));
		l1.add(new Player(1, "Kiron Pollard", 107, 8, "MI"));

	}

	void getName() {
		int runs=0;
		for(Player p:l1) {
			if(p.getPname().contains("r") && p.getJn()>25) {
				System.out.println(p.getPname());
			}
		}
		for (Player p : l1) {
			if(p.getRuns()>runs) {
				runs=p.getRuns();
			}
		}
		for(Player  p:l1) {
			if(p.getRuns()==runs) {
				System.out.println("Highest  Runner is: "+p.getPname());
			}
		}
	}

}
