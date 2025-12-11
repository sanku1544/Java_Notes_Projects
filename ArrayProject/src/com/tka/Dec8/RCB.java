package com.tka.Dec8;

public class RCB {
	Player rcb[] = new Player[11];
	int count=0;
	public RCB() {
		

		rcb[0] = new Player(18, "Virat Kohli", 7263, 4,"RCB");
		rcb[1] = new Player(33, "Faf du Plessis", 4133, 2,"RCB");
		rcb[2] = new Player(17, "Glenn Maxwell", 2719, 31,"RCB");
		rcb[3] = new Player(32, "Rajat Patidar", 404, 0,"RCB");
		rcb[4] = new Player(3, "Dinesh Karthik", 4516, 0,"RCB");
		rcb[5] = new Player(86, "Mahipal Lomror", 402, 2,"RCB");
		rcb[6] = new Player(66, "Cameron Green", 452, 5,"RCB");
		rcb[7] = new Player(11, "Mohammed Siraj", 96, 78,"RCB");
		rcb[8] = new Player(55, "Akash Deep", 21, 10,"RCB");
		rcb[9] = new Player(27, "Karn Sharma", 316, 61,"RCB");
		rcb[10] = new Player(99, "Yash Dayal", 10, 15,"RCB");
		
		
		

	}
	void operations() {
		for(Player r:rcb) {
			if(r.getRuns()%2!=0 &&  r.getJn()>20) {
				System.out.println(r.getName());
			}
			
		}
		for(Player m:rcb) {
			 if(m.getName().contains("r")) {
				 count++;
			 }
		 }
			System.out.println("Names that contains R: "+count);
	}
}
