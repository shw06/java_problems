package com.hw;

abstract class Bank{
	protected abstract void getBalance();
}
class bankA extends Bank{
	@Override
	protected void getBalance() {
		System.out.println("The balance in bank A is: ");
	}
}

public class hw2 {

	public static void main(String[] args) {
		bankA b1=new bankA();
		b1.getBalance();
	}

}
