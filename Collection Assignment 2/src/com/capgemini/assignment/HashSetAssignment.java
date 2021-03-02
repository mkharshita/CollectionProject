package com.capgemini.assignment;

import java.util.HashSet;
import java.util.Iterator;

/**
* The HashSetAssignment implements an application that
* simply have add elements in hashset, find size and 
* print its element using iterator
*/
public class HashSetAssignment {

	public static void main(String[] args) {
		
		HashSet<String> colours = new HashSet<String>();
		// use add() method to add values in the hash set
		colours.add("Red");
		colours.add("Green");
		colours.add("Black");
		colours.add("White");
		colours.add("Pink");
		colours.add("Yellow");

		System.out.println("Size of the Hash Set: " + colours.size());
		System.out.println("==================================");
		
		System.out.println("Print the hash set using iterator");
		// set Iterator 
	    Iterator<String> iterator = colours.iterator();
	    // Iterate the hash set
	    while (iterator.hasNext()) {
	    	System.out.println(iterator.next());
	    }
	    System.out.println("==================================");
	    
	}

}
