package com.tka.Dec29;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Features {
		void  mapping() {
			List<Integer> marks= Arrays.asList(45,78,96,48,85,63,73,88,94,79);
			List<Integer> gracemark = marks.stream().map(m->
			{if(m>85) {
				return m;
				}else{
					return m+5;
				}
			}
			).collect(Collectors.toList());
			
			System.out.println("Original Marks: "+marks);
			System.out.println("Grace Marks: "+gracemark);
		}
		void  filtering() {
			List<Integer> marks= Arrays.asList(45,78,96,48,85,63,73,88,94,79);
			List<Integer> toppers_list = marks.stream().filter(m->m>90
					).collect(Collectors.toList());
			List<Integer> average_list = marks.stream().filter(m->m>50 && m<80
					).collect(Collectors.toList());
			List<Integer> lowmarks_list = marks.stream().filter(m->m<50
					).collect(Collectors.toList());
			
			System.out.println("Original Marks: "+marks);
			System.out.println("Topper Marks: "+toppers_list);
			System.out.println("Average Marks: "+average_list);
			System.out.println("Low Marks: "+lowmarks_list);
		}
		void reducing() {
			List<Integer> marks= Arrays.asList(45,78,96,48,85,63,73,88,94,79);
			int sum = marks.stream().reduce(0,(n1,n2)->n1+n2);
			System.out.println("Sumof all numbers: "+sum);
			int sum1 = marks.stream().reduce(1000,(n1,n2)->n1+n2);
			System.out.println("Sum of all numbers: "+sum1);
		}
		void foreachMethod() {
			List<Integer> marks= Arrays.asList(45,78,96,48,85,63,73,88,94,79);
			
			marks.forEach(m->System.out.println(m));//replace of enhanced for loop
			System.out.println("--------------------------");
			marks.forEach(System.out::println);
		}
		
		void DateTime() {
			LocalDate dt= LocalDate.now(); 
			System.out.println(dt);
			LocalDate dt1= LocalDate.of(2004,04,15);
			System.out.println(dt1);
			LocalTime lt= LocalTime.now();
			System.out.println(lt);
			
			LocalDateTime dt2= LocalDateTime.now();
			System.out.println(dt2);
		}
		void Predicate() {
			Predicate<Integer> iseven= n->n%2==0;
			
			System.out.println(iseven.test(12));
		}
}

