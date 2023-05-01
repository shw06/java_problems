package com.Exception;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
		String name=null;
		
		System.out.println(name.length());
	}
		catch(Exception ex) {
			System.out.println(ex);
			System.out.println(ex.toString());
			System.out.println(ex.getMessage());
			ex.printStackTrace();

		}

}
}