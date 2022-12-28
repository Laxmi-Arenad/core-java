package com.xworkz.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ShoeSize {

	public static void main(String args[]) {
		
		
		ArrayList<Integer>shoesize=new ArrayList<Integer>() ;
		
		
		shoesize.add(6);
		shoesize.add(23 );
		shoesize.add(4);
		shoesize.add(1);
		shoesize.add(13);
		shoesize.add(18);
		shoesize.add(9);
		shoesize.add(11);
		shoesize.add(5);
		shoesize.add(3);
		shoesize.add(7);
		shoesize.add(2);
		shoesize.add(12);
		shoesize.add(22);
		shoesize.add(15);
		shoesize.add(20);
		shoesize.add(10);
		Iterator<Integer> i = shoesize.iterator() ;
		while(i.hasNext()) {
			System.out.println(i.next()) ;
			
		}
		
		for(Integer element:shoesize) {
			System.out.println(element);
		}
	}
	}





