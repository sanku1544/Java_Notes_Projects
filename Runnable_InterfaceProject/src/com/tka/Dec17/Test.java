package com.tka.Dec17;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class Test {

	public static void main(String[] args) {
		ExecutorService e1=  Executors.newFixedThreadPool(3);
		for(int i=1;i<9;i++) {
			Student s1=new Student(i);
			e1.submit(s1);
		}
		e1.shutdown();
	}

}
