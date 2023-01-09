package com.xworkz.mapingColle;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class AreaPincodeNames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
 Map<String,Integer> map = new HashMap();
 map.put("Ranna Belagali",587113);
 map.put("Mahalingpur",587343);
 map.put("Mudhol",587318);
 map.put("Bagalkot",587010);
 map.put("Belagaum",445352);
 map.put("Vijaypur",567633);
 map.put("Haveri",567667);
 map.put("Gadag",605357);
 map.put("Koppal",876655);
 map.put("Mysuru",706655);
 
 System.out.println(map);
	System.out.println(map.size());
	if(map.isEmpty()) {
		System.out.println("it is empty");
	}
	else{
		System.out.println("it is not empty");
	}
	Set<String> keys= map.keySet();
	keys.forEach(e->System.out.println(e));
	
	Collection<Integer>values= map.values();
	values.forEach(v->System.out.println(v));
	
	//Set<Entry<String,Integer>> entries=map.entrySet();
	
	//for(Entry<String,Integer> entry:entries) {
	//	System.out.println(entry.getKey()+" " +entry.getValues);
   
	}
}

	








	


