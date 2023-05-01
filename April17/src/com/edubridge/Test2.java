package com.edubridge;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter the number:");
	
	int x=sc.nextInt();
	
	System.out.println("Enter the number:");
	
	int y=sc.nextInt();
	
	
	System.out.println("Press 1 for Addition\nPress 2 for substraction"
			+ "\nPress 3 for Multiplication\nPress 4  for Division");
	int choice=sc.nextInt();
	
	switch(choice) {
	      
	case 1:
		System.out.println("Addition is:"+(x+y));
	break;
	case 2:
		System.out.println("Substraction is:"+(x-y));
	break;
	case 3:
		System.out.println("Multiplication is:"+(x*y));
	break;
	case 4:
		System.out.println("Division is:"+(x/y));
	break;
	default:
		System.out.println("Wrong choice");
	
	
	}
	
	}

}