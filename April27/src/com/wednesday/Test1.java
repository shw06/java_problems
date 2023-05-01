package com.wednesday;

import java.util.Vector;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector<String>v1=new Vector<String>();
		
		v1.add("C");
		v1.add("C++");
		v1.add("C#");
		v1.add("Java");
		
		System.out.println(v1);
		
		System.out.println(v1.indexOf("Java"));
		
		for(String i:v1) {
			System.out.println(i);
		}
		
		Vector v2=new Vector();
		v2.add("Edubridge");
		v2.add("Capgemini");
		v2.add(101);
		v2.add(102);
		
		System.out.println(v2);

		
		
		
	}
}


		


