package com.tka.Dec8;

public class RCB {
	Player[] rc;
	public RCB() {
		Player rcb[] = new Player[11];

		rcb[0] = new Player(18, "Virat Kohli", 7263, 4);
		rcb[1] = new Player(33, "Faf du Plessis", 4133, 2);
		rcb[2] = new Player(17, "Glenn Maxwell", 2719, 31);
		rcb[3] = new Player(32, "Rajat Patidar", 404, 0);
		rcb[4] = new Player(3, "Dinesh Karthik", 4516, 0);
		rcb[5] = new Player(86, "Mahipal Lomror", 402, 2);
		rcb[6] = new Player(66, "Cameron Green", 452, 5);
		rcb[7] = new Player(11, "Mohammed Siraj", 96, 78);
		rcb[8] = new Player(55, "Akash Deep", 21, 10);
		rcb[9] = new Player(27, "Karn Sharma", 316, 61);
		rcb[10] = new Player(99, "Yash Dayal", 10, 15);
		
		rc=rcb;
		

	}
	void operations() {
		for(Player r:rc) {
			if(r.getRuns()%2!=0 &&  r.getJn()>20) {
				System.out.println(r.getName());
			}
			
		}
	}
}
