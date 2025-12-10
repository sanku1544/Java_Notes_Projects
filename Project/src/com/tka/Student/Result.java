package com.tka.Student;

public class Result extends Student {
	 int m;
	 int n;
	 int o;
	 int p;
	 int total;
	 float per;
	 String grade;
	 private String sub1;
	private String sub2;
	private String sub3;
	private String sub4;
		
	public void subjects(String sub1, String sub2, String sub3, String sub4) {
			
			this.sub1 = sub1;
			this.sub2 = sub2;
			this.sub3 = sub3;
			this.sub4 = sub4;
			
		}
	public Result(String name, int roll, Long mobile, String course,String clg) {
		super( name,  roll,  mobile,  course,clg);
	}
	
	 
	public String getSub1() {
		return sub1;
	}
	public void setSub1(String sub1) {
		this.sub1 = sub1;
	}
	public String getSub2() {
		return sub2;
	}
	public void setSub2(String sub2) {
		this.sub2 = sub2;
	}
	public String getSub3() {
		return sub3;
	}
	public void setSub3(String sub3) {
		this.sub3 = sub3;
	}
	public String getSub4() {
		return sub4;
	}
	public void setSub4(String sub4) {
		this.sub4 = sub4;
	}
	void marks(int a,int b, int c,int d) {
		m=a;
		n=b;
		o=c;
		p=d;		
	}	
		
	void total() {
		total=m+n+o+p;
		per=total/4;
		if(total<=100 && total>=50) {
			grade="D";
		}else if(total>100 && total<=200) {
			grade="C";
		}else if(total>200 && total<=300) {
			grade="B";
		}
		else if(total>300 && total<400) {
			grade="A";
		}else {
			System.out.println("Fail");
		}
		}
	void result() {
		System.out.println("----------Student Details-----------");
		System.out.println("Student Name: \t"+super.getName());
		System.out.println("Roll no:  \t"+super.getRoll());
		System.out.println("Course:   \t"+super.getCourse());
		System.out.println("Mobile:   \t"+super.getMobile());
		System.out.println("College:   \t"+super.getCollege());
		System.out.println(sub1+" Marks:\t"+m);
		System.out.println(sub2+" Marks:\t"+n);
		System.out.println(sub3+" Marks:\t"+o);
		System.out.println(sub4+" Marks:\t"+p);
		System.out.println("----------------------------");
		System.out.println("Total marks:\t"+total);
		System.out.println("Percentage:\t"+per+"%");
		System.out.println("Grade is:\t"+grade);
		System.out.println("----------------------------");
	}
}
