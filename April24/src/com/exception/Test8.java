package com.exception;

public class Test8 {

	public void evenno(int no)
{
	if(no%2!=0)
	{
		throw new ArithmeticException("Number is not divisible by 2");
	}
	else
		
	{
		System.out.println("no is even");
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		Test8 t2=new Test8();
		t2.evenno(5);
	}

}