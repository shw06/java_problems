package com.Exception;

//Throw keyword declare inside the method
//explicitely handling error
public class Test6 {
	public void checkno(int num)
	{
		if(num<1)
		{
			throw new ArithmeticException("Number is less than 1"); 
		}
		else
		{
			System.out.println(num*num);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test6 t1=new Test6();
		
		t1.checkno(0);
	}

}