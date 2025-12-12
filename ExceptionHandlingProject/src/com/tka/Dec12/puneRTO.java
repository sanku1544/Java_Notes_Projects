package com.tka.Dec12;

import com.tka.allExceptions.AgeTooHighException;
import com.tka.allExceptions.AgeTooLowException;

public class puneRTO {
	public static void main(String []args) {
		
		UserDetails u1=new UserDetails("Sanket",19456641, 5);
		checkDetails c1= new checkDetails();
		try {
		c1.check(u1);
		}
		catch(AgeTooLowException e) {
			System.out.println(e);
			
		}catch(AgeTooHighException a) {
			System.out.println(a);
			
		}
	}
}
