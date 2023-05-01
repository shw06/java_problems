package com.edubridge;
//super keyword is always used for to execute parent class
//data only and u cant add that keyword in child class method
class Animal
{
	String  name="Tiger";
	public void show()
	{
		System.out.println("This is Animal Class");
	}
}
class Dog extends Animal
{
	
	public void show()
{
		super.show();
	System.out.println("The Dog name is:"+name);
}
	
}
class Cat extends Dog
{
	public void show()
	{
		super.show();
		System.out.println("This is cat class");
	}
}
public class Super {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cat c1=new Cat();
		
		c1.show();
		
	}

}