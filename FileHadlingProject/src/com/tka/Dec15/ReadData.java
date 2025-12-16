package com.tka.Dec15;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ReadData {
  @SuppressWarnings("resource")
public static void main(String[] args) {
	  Employee e1=null;
	  
	  
	  ObjectInputStream oi=null;
	  
	  String path="C:\\Users\\sanke\\OneDrive\\Desktop\\Java\\java.txt";
	  
	  try {
	
		  oi=new ObjectInputStream(new FileInputStream(path));
		  System.out.println("Reading object..");
		  
		  e1=(Employee) oi.readObject();
		  System.out.println("Id: "+e1.getId()+" Name: "+e1.getName()+" Email: "+e1.getEmail()+" Salary: "+e1.getSalary()+" Password: "+e1.getPassword());
	  }catch(Exception e) {
		e.printStackTrace();  
	  }
  }
}
