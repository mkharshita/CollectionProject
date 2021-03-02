package com.capgemini.assignment;

import java.util.TreeSet;

/**
* The TreeSetAssignment implements an application that
* simply have add elements in treeset, find size and 
* print its element and remove an element
*/
public class TreeSetAssignment {

	public static void main(String[] args) {
		TreeSet<String> colours = new TreeSet<String>();
		colours.add("Red");
		colours.add("Green");
		colours.add("Orange");
		colours.add("White");
		colours.add("Black");
		
		System.out.println("Size of the treeset = "+colours.size());
		System.out.println("==================================");
		
		System.out.println("Print the treeset");
		// Print the tree list
		for (String colour : colours) {
		    System.out.println(colour);
		}
		System.out.println("==================================");
		
		
		System.out.println("Removes Orange from the colours: "+colours.remove("Orange"));
		System.out.println("Tree set after removing last element: "+colours);
		
	}

}
