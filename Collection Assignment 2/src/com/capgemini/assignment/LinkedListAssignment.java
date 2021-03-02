package com.capgemini.assignment;

import java.util.LinkedList;


/**
* The LinkedListAssignment implements an application that
* simply have add elements in linkedlist, find size and 
* inset element in the end and front
*/
public class LinkedListAssignment {

	public static void main(String[] args) {
		LinkedList<String> colours = new LinkedList<String>();
	    // use add() method to add values in the linked list
		colours.add("Red");
		colours.add("Green");
		colours.add("Black");
		colours.add("White");
		colours.add("Pink");
		colours.add("Yellow");
		
		System.out.println("Size of the linkedlist = "+colours.size());
		System.out.println("===================================");
		
		
		System.out.println("Print the list");
		for (String colour : colours) {
		    System.out.println(colour);
		}
		System.out.println("===================================");
		
		// Add an element at the beginning 
		colours.addFirst("Blue"); 
		// Add an element at the end of list 
		colours.addLast("Cyan");
		System.out.println("Final linked list:" + colours);  

	}

}
