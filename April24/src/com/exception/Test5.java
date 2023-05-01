package com.exception;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			String name=null;
			System.out.println(name.length());
		}
		
		finally
		{
			System.out.println("HI All!!");
		}
		System.out.println("Hello everyone");
	}

}