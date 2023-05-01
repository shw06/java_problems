package com.edubridge;
//Overriding(runtime)same method,same argument
class Vehicle{
	String name="Maruti";
	public void disp()
	{
		System.out.println("Vehicle is:"+name);
	}
		
}
class Maruti 
{
	String speed="100km";
	public void disp()
	{
		
		System.out.println("Maruti speed is:"+speed);
	}
}
class Bicycle
{
	String color="blue";
	public void disp()
	{
		System.out.println("Bycycle color  is:"+color);
	}
}
public class Overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Vehicle v1=new Vehicle();
		
		v1.disp();
		
		Maruti m1=new Maruti();
		
		m1.disp();
		Bicycle b1=new Bicycle();
		
		b1.disp();
		
	}

}