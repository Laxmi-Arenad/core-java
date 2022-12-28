package com.xworkz.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class SoftwareCompanyNames {

	public static void main(String args[]) {
		
		
		ArrayList<String>softwarecompanynames=new ArrayList<String>() ;
		
		
		softwarecompanynames.add("Tcs ");
		softwarecompanynames.add("Wipro");
		softwarecompanynames.add("Infosys");
		softwarecompanynames.add("Hcl");
		softwarecompanynames.add("Tech Mahindra ");
		softwarecompanynames.add("accenture ");
		softwarecompanynames.add(" Oracle");
		softwarecompanynames.add(" Capgemini");
		softwarecompanynames.add("wns ");
		softwarecompanynames.add(" Intuit india");
		softwarecompanynames.add(" Trigent");
		softwarecompanynames.add("deloitte ");
		softwarecompanynames.add("Hp enterprise ");
		softwarecompanynames.add("Fis global ");
		softwarecompanynames.add(" Ey");
		softwarecompanynames.add("Vmware ");
		softwarecompanynames.add(" salesforce");
		softwarecompanynames.add("Rolta india ");
		softwarecompanynames.add("Cisco ");
		softwarecompanynames.add(" Kpmg");
		
		Iterator<String> i = softwarecompanynames. iterator() ;
		while(i.hasNext()) {
			System.out.println(i.next()) ;
			
		}
		
		for(String element:softwarecompanynames) {
			System.out.println(element);
		}
	}
	}





