package com.tka.HW;

import java.util.ArrayList;
import java.util.List;

public class KKR {
	List<Player> l1=new ArrayList<Player>();
	KKR(){
		
		l1.add(new Player(74, "Shreyas Iyer",2776, 0,  "KKR"));
		l1.add(new Player(12, "Andre Russell",2262, 96, "KKR"));
		l1.add(new Player(19, "Sunil Narine",1025, 157,"KKR"));
		l1.add(new Player(27, "Nitish Rana",2181, 7,"KKR"));
		l1.add(new Player(77, "Venkatesh Iyer",1326, 1,"KKR"));
		l1.add(new Player(23, "Rinku Singh",725,  0,"KKR"));
		l1.add(new Player(14, "Varun Chakravarthy",24,83,"KKR"));
		l1.add(new Player(10, "Pat Cummins",379,  45,"KKR"));
		l1.add(new Player(21, "Rahmanullah Gurbaz",302, 0,"KKR"));
		l1.add(new Player(8,  "Umesh Yadav",102, 136,"KKR"));
		l1.add(new Player(11, "Tim Southee",211, 62, "KKR"));

	}
	void  Operations() {
		for(Player p:l1) {
			if(p.getRuns()>1000 && p.getWickects()>40) {
				System.out.println("Allrounders:- "+p.getPname());
			}
		}
	}
}
