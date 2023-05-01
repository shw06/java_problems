package com.edubridge;

abstract class Product
{
	protected abstract void disp();
}
class productInfo extends Product
{
	@Override
	protected void disp() {
		System.out.println("This is disp  method");
	}
}

public class Test8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		productInfo p1=new productInfo();
		p1.disp();

	}

}
