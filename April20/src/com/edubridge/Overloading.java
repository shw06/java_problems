package com.edubridge;


class Calculations {
	public void add(int a, int b)
	{
		System.out.println("Addition is: "+(a+b));
	}
	
	public void add(int a, int b, int c)
	{
		System.out.println("Addition is :"+(a+b+c));
	}
	
	public void add(String a, String b)
	{
		System.out.println("Addition is:"+(a+b));
	}
}

public class Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculations c = new Calculations();
		c.add(10, 20);
		c.add(30, 40,55);
		c.add("shweta", "jagdhane");

	}

}

