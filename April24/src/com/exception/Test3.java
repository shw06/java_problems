package com.Exception;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//creating array
		try {
		int arr[]=new int[5];
		
		arr[10]=100;
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
			System.out.println(e.toString());
			System.out.println(e.getMessage());
			e.printStackTrace();

		}


	}
}