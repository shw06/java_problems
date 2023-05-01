package com.monday;

public class EnumExample {
	public enum Seasons{Winter, Summer, Monsoon}
	
	public enum Days{Sundays,Monday,Tuesday,Wednesday,Thursday,Friday,Saturday}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Seasons are:");
		for(Seasons s:Seasons.values())
		{
			System.out.println(s);
		}

		System.out.println("Days in a week are:");
		for(Days d:Days.values())
		{
			System.out.println(d);
		}

	}

}
