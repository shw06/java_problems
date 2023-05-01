package com.edubridge;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="Hello How are u??";
		//length is used to define size of the string including space
		System.out.println("The size of string s is:"+s.length());

	    String s1="Good afternoon";
	    //concat means join the 2 string 
	    System.out.println(s.concat(s1));
	    
	    String x="Hello";
	    String y="Hemlo";
	    String z="Hello";
	    String e="hello";
	    
	    if(x==e)
	    {
	    	System.out.println("Both strings are equal");
	    }
	    else
	    {
	    	System.out.println("Both strings are  not equal");
	    }
	    
	    String username,password;
	    
	    
	    Scanner sc=new Scanner(System.in);
	    
	    System.out.println("Enter username:");
	    username=sc.next();

	    System.out.println("Enter Password:");
	    password=sc.next();
	    
	    if(username=="admin" && password== "1234" )
	    {
	    	System.out.println("User login successfully");
	    }
	    else
	    {
	    	System.out.println("User not login successfully");
	    }
	}

}