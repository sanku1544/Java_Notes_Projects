package com.tka.Dec10;

public class StringMethods {
	void Methods() {
		String s=" Sanket@gmail.com  ";
		String s1="Nik am";
		String []s2= {"Rahul","Ramesh","Revti","Manish","Munna","Malvi","Meena"};
		int count=0;
		//methods
		//length
		System.out.println(s.length());
		System.out.println(s2.length);
		System.out.println("-------------------------");
		
		//charAt
		System.out.println(s.charAt(2));
		for(String i:s2) {
			count++;
			if(count==3) {
			System.out.println(i.charAt(4));
			}
		}
		System.out.println("-------------------------");
		
		//equals
		System.out.println(s.equals(s1)+" "+s.equalsIgnoreCase("sanket"));
		System.out.println("-------------------------");
		
		//contains
		System.out.println(s.contains("et"));
		for(String i:s2) {
			if(i.contains("sh")) {
			System.out.println(i);
			}
		}
		System.out.println("------------------------");
		
		//startWiths and endsWiths
		System.out.println(s.startsWith("Sa"));
		System.out.println(s1.endsWith("Ni"));
		System.out.println("------------------------");
		
		//indexOf and lastIndexOf
		System.out.println(s.indexOf("t"));
		System.out.println(s1.lastIndexOf("m"));
		System.out.println("------------------------");
		
		//substring
		System.out.println(s1.substring(1,3));
		System.out.println(s.substring(2));
		System.out.println("------------------------");
		
		//split
		String ss[]=s1.split(" ");
		System.out.println(ss[1]);
		System.out.println("------------------------");
		
		//trim
		System.out.println(s);
		System.out.println(s.trim());
		System.out.println("------------------------");
		
		//replace  and replaceAll
		System.out.println(s.replace("Sanket","Rohan"));
		System.out.println(s1.replaceAll(s, s1));
		System.out.println("------------------------");
		
		//toUpppercase and tolowerCase
		System.out.println(s.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println("------------------------");
		
		// isEmpty and isBlank
		System.out.println("   ".isBlank() +" "+s.isBlank());
		System.out.println(" ".isEmpty()+" "+s.isEmpty());
		System.out.println("------------------------");
		
		//compare
		System.out.println(s1.compareTo("Sanket"));// alphabets compare
		System.out.println("AB".compareToIgnoreCase("a"));
		System.out.println("------------------------");
		
		//matches
		System.out.println(s.matches(".*@.*"));
		System.out.println(s1.matches(".*@.*#.*"));
		System.out.println("------------------------");
		
		//value of
		int  n=78;
		String n1=String.valueOf(n);//convert anything into string
		System.out.println(n1);
		
		
		
	}
}
