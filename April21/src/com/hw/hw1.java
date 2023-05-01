package com.hw;

import java.util.Scanner;

public class hw1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number:");
		x = sc.nextInt();
		System.out.println("Enter second number:");
		y = sc.nextInt();
		
		System.out.println("Sum of two numbers is:"+(x+y));
		System.out.println("Product of two numbers is:"+(x*y));

	}

}
