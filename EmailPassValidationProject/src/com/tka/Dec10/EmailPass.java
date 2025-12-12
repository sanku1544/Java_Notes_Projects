package com.tka.Dec10;

public class EmailPass {
	
	void Valid() {

	    String email = "sanket@gmail.com ";
	    String tr = email.trim();
	    System.out.println(tr);

	    
	    if (!tr.contains("@")) {
	        System.out.println("Invalid: Email must contain '@'");
	        return;
	    }

	    
	    if (tr.indexOf("@") > tr.lastIndexOf(".")) {
	        System.out.println("Invalid: '.' must come after '@'");
	        return;
	    }

	    
	    if (tr.contains(" ")) {
	        System.out.println("Invalid: Email cannot contain spaces");
	        return;
	    }


	    if (!Character.isLetterOrDigit(tr.charAt(0))) {
	        System.out.println("Invalid: Email cannot start with special symbol");
	        return;
	    }

	    char last = tr.charAt(tr.length() - 1);
	    if (!Character.isLetterOrDigit(last)) {
	        System.out.println("Invalid: Email cannot end with special symbol");
	        return;
	    }

	    if (!tr.matches("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$")) {
	        System.out.println("Invalid: Email format is incorrect");
	        return;
	    }

	    System.out.println("Valid Email: " + tr);
	}

		
	void Pass() {
	    String pass = "45qdwww1@Sann";

	    if (pass.length() < 8) {
	        System.out.println("Invalid: Password must be at least 8 characters long");
	        return;
	    }

	    if (pass.contains(" ")) {
	        System.out.println("Invalid: Password cannot contain spaces");
	        return;
	    }

	    boolean hasUpper = false;
	    boolean hasLower = false;
	    boolean hasDigit = false;
	    boolean hasSymbol = false;

	    for (int i = 0; i < pass.length(); i++) {
	        char ch = pass.charAt(i);

	        if (Character.isUpperCase(ch))
	            hasUpper = true;
	        else if (Character.isLowerCase(ch))
	            hasLower = true;
	        else if (Character.isDigit(ch))
	            hasDigit = true;
	        else
	            hasSymbol = true; 
	    }

	   
	    if (!hasUpper) {
	        System.out.println("Invalid: Password must contain at least one uppercase letter");
	        return;
	    }

	    if (!hasLower) {
	        System.out.println("Invalid: Password must contain at least one lowercase letter");
	        return;
	    }

	    if (!hasDigit) {
	        System.out.println("Invalid: Password must contain at least one digit");
	        return;
	    }

	    if (!hasSymbol) {
	        System.out.println("Invalid: Password must contain at least one special symbol (@,#,$,%,&, etc.)");
	        return;
	    }

	   
	    System.out.println("Valid Password ✔: " + pass);
	}

}
