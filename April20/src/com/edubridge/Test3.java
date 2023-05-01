package com.edubridge;

//consructor overriding not supporting in java

//constructor overloading possible
class Shopping{
	public Shopping()
	{
		System.out.println("This is shopping ");
	}
	public Shopping(String name,String address) {
		System.out.println("I am purchasing"+name+ " product"+"\nShop address is:"+ address);
	}
}

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Shopping s1=new Shopping();
		Shopping s2=new Shopping(" Speaker"," Mumbai Dadar");
	}

}