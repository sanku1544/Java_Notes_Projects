package com.tka.Dec15;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class CopyData {
public static void main(String[] args) {
	FileOutputStream fo=null;
	ObjectOutputStream oo=null;
	
	ObjectInputStream oi=null;
	String path="C:\\Users\\sanke\\OneDrive\\Desktop\\Java\\java.txt";
	String path2="C:\\Users\\sanke\\OneDrive\\Desktop\\Java\\copyJava.txt";
	
	Employee e1=null;
	
		e1=new Employee(33,"Sanket","sanket@gmail.com","sanket123@",15000);
		
		System.out.println(e1);
		
		//FileOutput Operations
		
		try {
			System.out.println("\n------------Writing proccess------------");
		
			oo=new ObjectOutputStream(new FileOutputStream(path));
			
			oo.writeObject(e1);
			System.out.println("Write data successfully...");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(fo!=null) {
					fo.close();
				}
			}catch(Exception  e2) {
				e2.printStackTrace();
			}
		}
		
		 try (
				 FileInputStream fis = new FileInputStream(path);
	             FileOutputStream fos = new FileOutputStream(path2)) {
 
	            System.out.println("\n---- Copying file1 to file2 ----");
	            int data;
	            while ((data = fis.read()) != -1) {
	                fos.write(data);
	            }
	            System.out.println("File copied successfully");

	        } catch (Exception e) {
	            e.printStackTrace();
	        }

		
		
		
		 try {
				System.out.println("\n------------Readint process------------");
			  oi=new ObjectInputStream(new FileInputStream(path2));
			  System.out.println("Reading object..");
			  
			  e1=(Employee) oi.readObject();
			  System.out.println("\nId: "+e1.getId());
			  System.out.println("Name: "+e1.getName());
			  System.out.println("Email: "+e1.getEmail());
			  System.out.println("Salary: "+e1.getSalary());
			  System.out.println("Password: "+e1.getPassword());
		  }catch(Exception e) {
			e.printStackTrace();  
		  }
}
}
