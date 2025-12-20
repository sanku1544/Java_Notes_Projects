package com.tka.Dec19;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
		public static void main(String []args) {
			List l1=new ArrayList();
			
			l1.add(45872);
			
			Set s1=new HashSet();
			Set<Integer> s2=new TreeSet<Integer>();
			Set s3=new LinkedHashSet();
			
			s1.add(10);
			s1.add("Sanket");
			s1.add('B');
			s1.add(15000);
			s1.add(10);
			s1.add(l1);
			
			System.out.println("Data using HashSet: "+s1);
			
			s2.add(10);
			s2.add(15000);
			s2.add(10);
			s2.add(-10);
			s2.add(180);
			
			System.out.println("Data using TreeSet: "+s2);

			
			s3.add(10);
			s3.add("Sanket");
			s3.add('B');
			s3.add(15000);
			s3.add(10);
			s3.add(l1);
			
			System.out.println("Data Using LinkedHashSet: "+s3);

			
				
		}
}
