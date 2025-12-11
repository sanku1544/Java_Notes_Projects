package com.tka.Dec10;

public class EmailPass {
	
		void Valid() {
			
			String email= "sanket@gmail.com ";
			
			String tr=email.trim();
			System.out.println(tr);
			
			if(tr.contains("@")) {
				if(tr.indexOf("@")<tr.lastIndexOf(".")) {
					if(!tr.contains(" ")) {
						if(tr.matches(".*@.*#*-*")) {
							if(!tr.startsWith(".*@.*#*_*!*")) {
								if(!tr.endsWith(".*@.*#*_*!*")) {
									System.out.println("Valid mail");
								}else {
									System.out.println("Symbols is not  allowed in end");
								}
							}else {
								System.out.println("Symbol is not allowed  from start: ");
							}
						}else {
							System.out.println("Symbol is maditory: ");
						}
					}else {
						System.out.println("Space is not allowed: ");
					}
				}else {
					System.out.println("Enter proper email: ");
				}
			}else {
				System.out.println("Enter @ is  required: ");
			}
			
			
		}
		
		void Pass() {
			
		}
}
