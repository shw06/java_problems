package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<String>a1=new ArrayList<String>();
		
		a1.add("Tanvi");
		a1.add("Shweta");
		a1.add("mohad");
		a1.add("Ayan");
		a1.add("Arun");
		a1.add("Ayan");
		System.out.println(a1);//original data
	
		System.out.println("Sorting Data in ascending order.........");
		Collections.sort(a1);
		System.out.println(a1);//ascending order
		
		System.out.println("Sorting Data in descending order.........");
		Collections.sort(a1,Collections.reverseOrder());
		System.out.println(a1);//descending order
		System.out.println("Current object data is printing in reverse order.........");
		Collections.reverse(a1);
		System.out.println(a1);
	
}
	
		
		
	}