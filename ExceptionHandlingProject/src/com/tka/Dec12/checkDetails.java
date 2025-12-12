package com.tka.Dec12;

import com.tka.allExceptions.AgeTooHighException;
import com.tka.allExceptions.AgeTooLowException;

public class checkDetails  {
		static {
			System.out.println("Welcome to Pune RTO ");
		}
		void check(UserDetails user) throws AgeTooLowException,AgeTooHighException {
			int age=user.getAge();
			if(age<=18) {
				throw new AgeTooLowException("Below 18 age is not allowed ");
			}else if(age>=75) {
				throw  new AgeTooHighException("Maximum age limit is 75 ");
			}else {
				System.out.println("You are eligiblle for making Driving Licence ");
			}
			
		}
}
