package com.tka.Dec9;

public class Test {

	public static void main(String[] args) {
		
		String s1= new String("Sanket");
		String s2="Sanket";
		
		System.out.println(s1);
		System.out.println(s1.intern());
		System.out.println(s2);
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s1.intern()));
		System.out.println(s1.intern()==s2);
		System.out.println(s1.intern().equals(s2));
		
		
		
		
		StringBuffer sb=new StringBuffer("SANKET");
		System.out.println(sb);
		System.out.println(sb.hashCode());
		
		String res=sb.toString();
		System.out.println(s1.equals(res));
		
		
		sb.append(" Nikam");
		System.out.println(sb);
		System.out.println(sb.hashCode());

	}

}
