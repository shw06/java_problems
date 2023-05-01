package com.edubridge;

import java.util.Scanner;

public class student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int sid;
		String sname;
		int math, english, science, geography;
		int totalmarks;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Student id:");
		sid=sc.nextInt();
		
		System.out.println("Enter Student name:");
		sname=sc.next();
		
		System.out.println("Enter Student math marks:");
		math=sc.nextInt();
		
		System.out.println("Enter Student English marks:");
		english=sc.nextInt();
		
		System.out.println("Enter Student Sciecne marks:");
		science=sc.nextInt();
		
		System.out.println("Enter Student Geography marks:");
		geography=sc.nextInt();
		
		totalmarks= ((math+english+science+geography)/400)*100;
		
		System.out.println("Student id:"+sid+"\nStudent name:"+sname+
				"\nStudent total marks :"+totalmarks);
		if(totalmarks>=90)
		{
			System.out.println("A+");
		}
		//else if(totalsalary>=75000 && totalsalary<90000)
		else if(totalmarks>=80)
		{
			System.out.println("A");
		}
		else if(totalmarks>=60)
		{
			System.out.println("B+");
		}
		else if(totalmarks>=50)
		{
			System.out.println("B");
		}
		else if(totalmarks>=35)
		{
			System.out.println("C");
		}
		
		else
		{
			System.out.println("Fail");
		}
		
	}

}