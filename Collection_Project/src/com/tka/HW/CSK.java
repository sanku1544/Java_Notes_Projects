package com.tka.HW;

import java.util.ArrayList;
import java.util.List;

public class CSK {
  List<Player> l1=new ArrayList<Player>();
  CSK(){
	
	  l1.add(new Player(7,  "MS Dhoni", 5082, 0, "CSK"));
	  l1.add(new Player(31, "Ruturaj Gaikwad", 1797, 0, "CSK"));
	  l1.add(new Player(8,  "Ravindra Jadeja", 2692, 152, "CSK"));
	  l1.add(new Player(90, "Deepak Chahar",  79,   72, "CSK"));
	  l1.add(new Player(18, "Devon Conway",  924,  0, "CSK"));
	  l1.add(new Player(99, "Moeen Ali",1015, 35, "CSK"));
	  l1.add(new Player(10, "Ambati Rayudu", 4348, 0, "CSK"));
	  l1.add(new Player(55, "Dwayne Bravo", 1560, 183,"CSK"));
	  l1.add(new Player(25, "Shivam Dube",  1103, 4,  "CSK"));
	  l1.add(new Player(11, "Mitchell Santner",103,  15, "CSK"));
	  l1.add(new Player(13, "Matheesha Pathirana", 0, 45, "CSK"));

  }
  void Operations() {
	  for(Player p:l1) {
		  if(p.getPname().startsWith("D")) {
		  System.out.println("D name players: "+p.getPname());
		  }
	  }
  }
}
