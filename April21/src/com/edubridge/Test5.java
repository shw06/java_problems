package com.edubridge;

abstract class vehicle
{
	vehicle()
	{
		System.out.println("This is vehicle default constructor");
	}
	abstract void speed(String s);
}
class Maruti extends vehicle
{
	@Override
	void speed(String s) {
		System.out.println("The speed of maruti is:" + (s));
	}
}
class Bicycle extends Maruti
{
	Bicycle(){
		System.out.println("This is Bicycle constructor");
	}
	Bicycle( String color){
		System.out.println("This is Bicycle constructor"+color);
	}
	@Override
	
	void speed(String s) {
		super.speed(s);
		// TODO Auto-generated method stub
		System.out.println("The speed of Bicycle is:"+(s));
	}
}
public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bicycle b1=new Bicycle();
		
		b1.speed("100km");
		
		Bicycle b2=new Bicycle("red");
	}

}