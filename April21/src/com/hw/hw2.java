package com.hw;

import java.util.Scanner;

public class hw2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x,y,sum,prod;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number:\n");
		x=sc.nextInt();
		System.out.println("Enter second number:\n");
		y=sc.nextInt();
		sum = x + y;
		System.out.println("The sum of x and y is:"+ sum);
		prod=x*y;
		System.out.println("The product of x and y is:"+prod);
	}

}
