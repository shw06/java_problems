package com.exception;

public class Test7   {

	public void checkage(int age) throws AgeException {
		if(age<18)
		{
			throw new AgeException("U cant vote age is less");
		}
		else
		{
			System.out.println("u can vote");
		}
	}
	public static void main(String[] args) {
		
		Test7 t=new Test7();
		try {
			t.checkage(8);
		} catch (AgeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}