package com.tka.Dec22;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainClass {

	public static void main(String[] args) {
		
		Example e1= new Example();
		
		Map<String,List<String>> movies2025=new HashMap<>();
		movies2025.put("Dhurander",e1.movie());
		movies2025.put("Simbha",e1.movie1());
		movies2025.put("Kantara",e1.movie2());
		movies2025.put("Chava",e1.movie3());
		for(String s:movies2025.keySet()) {
				if(s.contains("Chava")) {
					
					System.out.println(movies2025.get(s));
				}
				
		}
		System.out.println("-----------------------------------------------");
		for (Map.Entry<String,List<String>> entry:movies2025.entrySet()) {
		    List<String> cast = entry.getValue();

		    if (cast.contains("Ranveer Sigh")) { 
		    	
		        System.out.println(entry.getKey() + " :- " + cast);
		    }
		}
		
		
		
	}

}
