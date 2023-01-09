package com.xworkz.mapingColle;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CompaniesSoftwares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
 Map<String,String> map = new HashMap();
 map.put("Accenture","Java");
 map.put("Infosys","sql");
 map.put("Acer","Web");
 map.put("IBM","gitHub");
 map.put("Wipro","React");
 map.put("Tech Mahendra","Javascript");
 map.put("TCS","Html");
 map.put("HCL","Vagrant");
 map.put("Oracle","doctrine");
 map.put("Capgemeni","Bootstrap");
 
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
	
	Collection<String>values= map.values();
	values.forEach(v->System.out.println(v));
	
	//Set<Entry<String,Integer>> entries=map.entrySet();
	
	//for(Entry<String,Integer> entry:entries) {
	//	System.out.println(entry.getKey()+" " +entry.getValues);
   
	}
}

	








	


