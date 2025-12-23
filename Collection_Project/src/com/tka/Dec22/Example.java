package com.tka.Dec22;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Example {
	void Level0() {
		
		Map map=new HashMap();
		
		map.put(25,"Sanket");
		map.put('s',52.02);
		map.put(false,'n');
		
		System.out.println("HashMap way: "+map);
		
		Map map2=new TreeMap();
		
		map2.put(25,"Sanket");
		map2.put(5,52.02);
		map2.put(10,'n');
		
		System.out.println("TreeMap way: "+map2);
		
		Map map1=new LinkedHashMap();
		
		map1.put(25,"Sanket");
		map1.put('s',52.02);
		map1.put(false,'n');
		
		System.out.println("LikedHashMap way: "+map1);
		
		
		
		
	}
	
	void Level1() {
		Map<Integer,String> studentDB=new HashMap<Integer,String>();
		
		studentDB.put(55,"Sanket");
		studentDB.put(15,"Jay");
		studentDB.put(53,"Viru");
		
		System.out.println("Specifi values : "+studentDB);
	}
	
	void LevelOnehalf() {
Map<Integer,String> studentDB=new HashMap<Integer,String>();
		
		studentDB.put(55,"Sanket");
		studentDB.put(15,"Jay");
		studentDB.put(53,"Viru");
		studentDB.put(53,"Manoj");//override the value
		
		System.out.println(studentDB.get(53));
		System.out.println(studentDB.keySet());
		for(Integer i:studentDB.keySet()) {
			System.out.println("key: "+i+" -- "+studentDB.get(i));
		}
		
		System.out.println("All values: "+studentDB.values());
		for(String s:studentDB.values()) {
			if(s.contains("n")) {
				System.out.println("Contains name: "+s);
			}  
		}   
		
		System.out.println("Size of studentDB: "+studentDB.size());
		
		for(Map.Entry<Integer,String> entry:studentDB.entrySet()) {
			System.out.println("Key: "+entry.getKey()+" : "+"Value: "+entry.getValue());
		}
	}  
	
	void Level2() {
		
	}
}
