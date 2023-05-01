package com.edubridge;
class Student
{
	String name;
	String address;
	int age;
	public void info(String name,String address,int age)
	{
		System.out.println(name+" "+address+" "+age);
	}
}

class Employee extends Student
{
	public void info(String name,String address,int age)
	{
		super.info("jhon", "Banglore", 15);
		System.out.println(name+" "+address+" "+age);
	}
}
public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Employee e1=new Employee();
       
       e1.info("sam", "pune", 22);

		
				
	}

}