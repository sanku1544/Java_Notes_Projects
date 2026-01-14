package com.tka.Jan10;

public class EmployeeTest {

	public static void main(String[] args) {
		int max=0;
		Employee []e1= new Employee[5];
		e1[0]=new Employee(1,"Sanket",21,15000);
		e1[1]=new Employee(2,"Atul",22,12000);
		e1[2]=new Employee(3,"Krishna",21,9000);
		e1[3]=new Employee(4,"Lokesh",25,25000);
		e1[4]=new Employee(5,"Jay",25,18000);
		for(int i=0;i<e1.length;i++) {
			if(max<e1[i].getSalary()) {
				max=e1[i].getSalary();
			}
		}
		for(int i=0;i<e1.length;i++) {
			if(max==e1[i].getSalary()) {
				System.out.println("Max salry of employee: ");
				e1[i].display();
			}
		}
		

	}

}
