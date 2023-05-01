package com.hw;

abstract class Parent{
	protected abstract void message();
}
class child1 extends Parent{
	@Override
	protected void message() {
		System.out.println("This is first subclass");
	}
}

public class hw1 {

	public static void main(String[] args) {
		child1 c1=new child1();
		c1.message();

	}

}
