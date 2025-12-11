package com.tka.Dec8;

public class CSK {
	 Player csk[] = new Player[11];
	int count=0;
  CSK() {
	

	 csk[0]  = new Player(7,  "MS Dhoni",   5082, 0,"CSK");
	 csk[1]  = new Player(31, "Ruturaj Gaikwad", 1797, 0,"CSK");
	 csk[2]  = new Player(9,  "Ravindra Jadeja", 2677, 152,"CSK");
	 csk[3]  = new Player(33, "Shivam Dube", 688, 0,"CSK");
	 csk[4]  = new Player(5,  "Moeen Ali",   1033, 33,"CSK");
	 csk[5]  = new Player(99, "Matheesha Pathirana", 40, 26,"CSK");
	 csk[6]  = new Player(8,  "Ajinkya Rahane",  4434, 0,"CSK");
	 csk[7]  = new Player(90, "Deepak Chahar",  79, 72,"CSK");
	 csk[8]  = new Player(24, "Tushar Deshpande",  45, 30,"CSK");
	 csk[9]  = new Player(18, "Daryl Mitchell", 667, 14,"CSK");
	 csk[10] = new Player(27,"Sameer Rizvi", 52, 0,"CSK");
	 
	
	
 }
  void operations() {
	  for(Player c:csk) {
			 if(c.getRuns()%2==0) {
				 System.out.println(c.getName()+" = "+c.getRuns());
			 }
			 			 
		 }
		 System.out.println("-------------------------------");
		 for(Player c:csk) {
			 if(c.getJn()<50) {
				 System.out.println(c.getName()+" jn= "+c.getJn());
			 }
		 }
		 for(Player m:csk) {
			 if(m.getName().contains("r")) {
				 count++;
			 }
		 }
			System.out.println("Names that contains R: "+count);

  }
}
