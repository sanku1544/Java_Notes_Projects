package com.tka.Student;

public class Test {
		void Student1() {
			
			Result r1=new Result("Sanket",12,775155225L,"BCA","ZBP");
			r1.marks(52,45,84,56);
			r1.subjects("Math","Scince","Marathi","English");
			r1.total();
			r1.result();
		}
		void Student2() {
		
			Result r1=new Result("Pratik",15,915155225L,"BE","ZBP");
			r1.marks(56,46,85,56);
			r1.subjects("Math","Scince","Geography","History");
			r1.total();
			r1.result();
		}
	public static void main(String[] args) {
		Test t1=new Test();
		//t1.Student1();
		t1.Student2();
	}

}
