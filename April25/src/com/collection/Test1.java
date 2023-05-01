package com.collection;

import java.util.ArrayList;
import java.util.List;

public class Test1 {

	public static void main(String[] args) {
		
        ///The Integer class wraps a value of the primitive type int in an object
		//int is primitive data type
		//INTEGER is wrapper class
		//ArrayList <Integer>l1= new ArrayList<Integer>();
		
		
		List <Integer>l1= new ArrayList<Integer>();
		
		l1.add(101);
		l1.add(102);
		l1.add(103);
		l1.add(104);
		l1.add(105);
		System.out.println(l1);
		
		System.out.println(l1.size()); // to get length of arraylist
		
		System.out.println(l1.indexOf(103));
		
		ArrayList a1=new ArrayList();
		a1.add(101);
		a1.add("Jhon");
		a1.add("mumbai");
		System.out.println(a1);
	}
	

}