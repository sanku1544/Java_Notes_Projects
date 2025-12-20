package com.tka.Practice;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadDataPractice {
	public static void main(String []args) {
		String path="C:\\Users\\sanke\\OneDrive\\Desktop\\Java\\practice.txt";
		String path1="C:\\Users\\sanke\\OneDrive\\Desktop\\Java\\practice2.txt";
		 
		try {
			FileReader  fr=new FileReader(path);
			FileWriter  fw=new FileWriter(path1);
			
			int n;
			while((n=fr.read()) !=-1) {
				fw.write(n);
			}
			 fr.close();
	            fw.close();
			System.out.println("Copy data successfully...");
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		try {
			FileReader  fr1=new FileReader(path1);
			System.out.println("Data of cpoying file...");
			
			int n;
			while((n=fr1.read()) !=-1) {
				System.out.print((char)n);
			}
			fr1.close();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}
}
