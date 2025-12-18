package com.tka.HW;

import java.util.ArrayList;
import java.util.List;

public class RCB {
	List<Player> l1=new ArrayList<Player>();
	
	RCB(){
		
		l1.add(new Player(18, "Virat Kohli",7263, 4,  "RCB"));
		l1.add(new Player(17, "AB de Villiers",5162, 0,  "RCB"));
		l1.add(new Player(13, "Faf du Plessis",4133, 0,  "RCB"));
		l1.add(new Player(97, "Glenn Maxwell",2771, 31, "RCB"));
		l1.add(new Player(11, "Mohammed Siraj",0,    83, "RCB"));
		l1.add(new Player(5,  "Dinesh Karthik",4516, 0,  "RCB"));
		l1.add(new Player(32, "Wanindu Hasaranga",281,  67, "RCB"));
		l1.add(new Player(6,  "Shahbaz Ahmed",539,  19, "RCB"));
		l1.add(new Player(19, "Josh Hazlewood",55,   83, "RCB"));
		l1.add(new Player(96, "Harshal Patel",230,  99, "RCB"));
		l1.add(new Player(10, "Rajat Patidar",799,  0,  "RCB"));

	}
	void Operations() {
		int wk=0;
		for(Player p:l1) {
			if(p.getWickects()>wk) {
				wk=p.getWickects();
			}
		}
		for(Player p:l1) {
			if(p.getWickects()==wk) {
				System.out.println("Highest wicketTecker is:- "+p.getPname());
			}
		}
	}
}
