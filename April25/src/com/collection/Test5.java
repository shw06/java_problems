package com.collection;

import java.util.LinkedList;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String>a1=new LinkedList<String>();
		a1.add("Tanvi");
		a1.add("Shweta");
		a1.add("mohad");
		a1.add("Ayan");
		a1.add("Arun");
		a1.add("Ayan");
		
		System.out.println(a1);
		
		a1.remove(); //by default 1st element gets removed
		System.out.println(a1);
		
		a1.remove(3);//remove elements from particular index
		System.out.println(a1);
		a1.removeFirst();
		System.out.println(a1);
		a1.removeLast();
		System.out.println(a1);
		a1.removeAll(a1);
		System.out.println(a1);
		a1.add("Ayan");
		a1.add("Arun");
		a1.add("Ayan");
		a1.add("red");
		a1.add("Ayan");
		System.out.println(a1);
		a1.removeLastOccurrence("Ayan");
		System.out.println(a1);
		a1.removeFirstOccurrence("Ayan");
		System.out.println(a1);
		a1.clear();
		System.out.println(a1);
	}
	

}