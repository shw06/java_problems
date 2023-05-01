package com.edubridge;

import java.util.Scanner;

//Take input user for array
public class Test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size=sc.nextInt();
		//declare array
		int[]a=new int[size];
		//reading the data
		System.out.println("Enter the elements");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		//display the data
		System.out.println("The array elements are:");
		for(int i=0;i<a.length;i++)
		{
			//System.out.print(a[i]+"\t");
			System.out.println(a[i]);
		}
		
		
		
	}

}