package com.tka.Dec8;

public class RR {
	Player rr[] = new Player[11];
	int count=0;
public RR() {
	

	rr[0]  = new Player(7, "Sanju Samson", 2765, 7,"RR");
	rr[1]  = new Player(55, "Jos Buttler", 3223, 5,"RR");
	rr[2]  = new Player(9, "Yashasvi Jaiswal", 1275, 8,"RR");
	rr[3]  = new Player(63, "Shimron Hetmyer", 1024, 27,"RR");
	rr[4]  = new Player(10, "Riyan Parag", 756, 7,"RR");
	rr[5]  = new Player(29, "Ravichandran Ashwin", 512, 17,"RR");
	rr[6]  = new Player(8, "Trent Boult", 134, 44,"RR");
	rr[7]  = new Player(22, "Yuzvendra Chahal", 88, 46,"RR");
	rr[8]  = new Player(33, "Dhruv Jurel", 298, 7,"RR");
	rr[9]  = new Player(14, "Sandeep Sharma", 77, 9,"RR");
	rr[10] = new Player(3, "Avesh Khan", 45, 2,"RR");

}

	void operations() {
		int totalRuns = 0;
		
	  for(Player r:rr) {
		  totalRuns +=r.getRuns();
		 // System.out.println("Total Runs: "+totalRuns);
	  }
	  System.out.println("Total Runs: "+totalRuns);
	  for(Player m:rr) {
			 if(m.getName().contains("r")) {
				 count++;
			 }
		 }
			System.out.println("Names that contains R: "+count);
}
}
