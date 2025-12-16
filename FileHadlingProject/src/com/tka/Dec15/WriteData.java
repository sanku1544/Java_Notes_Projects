package com.tka.Dec15;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class WriteData {
		public static void main(String[] args) {
			FileOutputStream fo=null;
			ObjectOutputStream oo=null;
			
			String path="C:\\Users\\sanke\\OneDrive\\Desktop\\Java\\java.txt";
			
			Employee e1=null;
			
				e1=new Employee(33,"Nikam","sanket@gmail.com","sanket123@",15000);
				
				System.out.println(e1);
				
				//FileOutput Operations
				
				try {
					System.out.println("1");
				
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
		}
}
