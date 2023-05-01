package com.edubridge;

class Product
{
	String pname;
	int prise;
	 Product() //default constructor
	{
		
		System.out.println("This is default constructor");
	}
	
	Product(String pname,int prise) //parameterised constructor
	{
		System.out.println("The product name is:"+pname+"\nThe product prise:"+prise);
	}
}
public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Product p2=new Product();
		Product p1=new Product("Speaker",1500);
	}

}
