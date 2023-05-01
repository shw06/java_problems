package com.edubridge;

abstract class Animal 
{
	abstract void eating();
	
	void barking()
	{
		System.out.println("This is barking method");
	}
}
class DemoAnimal extends Animal
{
	@Override
	void eating() {
		System.out.println("this is eating method");
	}
}

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoAnimal d1=new DemoAnimal();
		
		d1.barking();
		d1.eating();

	}

}

