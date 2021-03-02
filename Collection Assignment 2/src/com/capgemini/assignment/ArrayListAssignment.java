package com.capgemini.assignment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/**
* The ArrayListAssignment implements an application that
* simply have add elements in arraylist, retrieve it and 
* sort the arraylist
*/
public class ArrayListAssignment {

	public static void main(String[] args) {
		List<String> listStrings = new ArrayList<String>();
		
		// use add() method to add values in the array list
		listStrings.add("Red");
		listStrings.add("Green");
		listStrings.add("Orange");
		listStrings.add("White");
		listStrings.add("Black");
		
		System.out.println("Print the list");
		listStrings.forEach((listString)->System.out.println(listString));
		System.out.println("==============================");
		  
		System.out.println("Print the sorted arraylist");
		Collections.sort(listStrings);
		System.out.println(listStrings);
		System.out.println("==============================");
		
		System.out.println("SIze of the arraylist = "+listStrings.size());

	}

}
