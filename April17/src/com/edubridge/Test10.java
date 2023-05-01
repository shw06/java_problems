package com.edubridge;

import java.util.Scanner;

public class Test10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr = new int[5];
		int sum = 0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the elements");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];  
	        }  
	        System.out.println("Sum of all the elements of an array: " + sum);  
	    }  
			
	}
