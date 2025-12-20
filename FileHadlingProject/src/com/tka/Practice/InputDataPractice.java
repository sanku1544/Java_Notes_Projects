package com.tka.Practice;

import java.io.FileWriter;
import java.io.IOException;

public class InputDataPractice {
public static void main(String []args) {
	String path="C:\\Users\\sanke\\OneDrive\\Desktop\\Java\\practice.txt";
	try {
		FileWriter fw=new FileWriter(path);
		fw.write("Sanket Nikam");
		fw.close();
		
		System.out.println("Data written successfully: ");
	} catch (IOException e) {
		
		e.printStackTrace();
	}
}
}
