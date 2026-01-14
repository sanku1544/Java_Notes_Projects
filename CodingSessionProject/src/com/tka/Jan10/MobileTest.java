package com.tka.Jan10;

public class MobileTest {

	public static void main(String[] args) {
		
		int max=0;
		Mobile []m1=new Mobile[5];
		m1[0]=new Mobile(1545423155L,"Samsung",40000);
		m1[1]=new Mobile(11553355L,"Redmi",50000);
		m1[2]=new Mobile(22553355L,"Moto",60000);
		m1[3]=new Mobile(581553355L,"Realme",70000);
		m1[4]=new Mobile(20553355L,"Jio",80000);
//		for(Mobile m:m1) {
//			System.out.print("\n");
//			m.display();
		for(int i=0;i<m1.length;i++) {
			if(max<m1[i].getCost()) {
				max=m1[i].getCost();
			}
		}
		for(int i=0;i<m1.length;i++) {
			if(max==m1[i].getCost()) {
			System.out.println("Expensive mobile: ");
				m1[i].display();
			}
		}
		

	}

}
