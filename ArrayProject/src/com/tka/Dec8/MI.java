package com.tka.Dec8;

public class MI {
	 Player mi[]=new Player[11];
	 int count=0;
	MI() {
 
  
   mi[0]=new Player(45,"Rohit Sharma",2341,2,"MI");
   mi[1]=new Player(12,"Tim David",421,3,"MI");
   mi[2]=new Player(5,"Tilak Varmaa",541,7,"MI");
   mi[3]=new Player(20,"Suryakumar Yadav",442,1,"MI");
   mi[4]=new Player(17,"Hardik Pandya",109,0,"MI");
   mi[5]=new Player(33,"Mitchel Santner",121,4,"MI");
   mi[6]=new Player(11,"Dipak Chahar",55,6,"MI");
   mi[7]=new Player(07,"Jasprit Bumrah",11,9,"MI");
   mi[8]=new Player(19,"Trent Bolt",74,5,"MI");
   mi[9]=new Player(10,"Devald Bravis",234,0,"MI");
   mi[10]=new Player(1,"Kiron Pollard",107,8,"MI");
   
   
	
	}
	
	void operations() {
		for(Player n:mi) {
			   if(n.getRuns()>500) {
			   System.out.println(n.getName());
			   }
			   if(n.getWickets()>2) {
				   System.out.println(n.getName());
			   }
		   }
		for(Player m:mi) {
			 if(m.getName().contains("r")) {
				 count++;
			 }
		 }
			System.out.println("Names that contains R: "+count);
	}
	 
	
}
