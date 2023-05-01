package com.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList <String>l1=new ArrayList<String>();
		
		l1.add("red");
		l1.add("mango");
		l1.add("apple");
		l1.add("custeredapple");
		l1.add("red");
		
		System.out.println(l1);
		
		//Iterator-class
		//to traverse data
		Iterator itr=l1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
			System.out.println("For loop:");
			for(String s:l1) {
				System.out.println(s);
			}
			l1.add("watermelon");
			System.out.println(l1);
			
			l1.add(3,"white");
			System.out.println(l1);
			
			//l1.clear();//it will remove all the elements from l1 object
			
			if(l1.isEmpty())
			{
				System.out.println("Data is not available");
			}
			else
			{
				System.out.println("Data is  available");
			}
		}

	}	
		
		