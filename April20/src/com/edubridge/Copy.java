package com.edubridge;


class Fruit {
	String fname;
	int fprice;
	
	Fruit(String fname, int fprice){ //first constructor
		this.fname=fname;
		this.fprice=fprice;		
	}
	
	Fruit(Fruit fruit){
		System.out.println("Copying first constructor");
		this.fname=fruit.fname;
		this.fprice=fruit.fprice;
	}
	
	String name(){
		return fname;
	}
	
	int price() {
		return fprice;
	}
}

public class Copy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruit f1 = new Fruit("Mango",100);
		System.out.println("first constructor"+f1.name());
		System.out.println("first constructor"+f1.price());
		Fruit f2 = new Fruit(f1);
		System.out.println("first constructor"+f2.name());
		System.out.println("first constructor"+f2.price());
	}

}




