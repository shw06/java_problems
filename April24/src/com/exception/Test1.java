package com.Exception;

public class Test1 {

	public static void main(String[] args) {
		
    try {
		int a=10,b=0;
		System.out.println(a/b);
	}
     catch(Exception e)
{
    	 System.out.println(e);
    	System.out.println(e.toString());
    		System.out.println(e.getMessage());
    		e.printStackTrace();}

}
}
