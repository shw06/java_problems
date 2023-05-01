package com.hw;

import java.util.Scanner;

public class hw3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);

		System.out.print("Enter the length of the rectangle: ");
        double length = sc.nextDouble();

        System.out.print("Enter the breadth of the rectangle: ");
        double breadth = sc.nextDouble();

        // Calculate the area of the rectangle
        double area = length * breadth;

        // Convert the area to an integer
        int areaInt = (int) area;

        // Print the area as an integer
        System.out.println("The area of the rectangle is: " + areaInt);
    }
}
