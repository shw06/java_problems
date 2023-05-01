package com.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		employee e1=new employee(101,"jhon",32);
		employee e2=new employee(102,"sam",22);
		employee e3=new employee(102,"Ajay",20);
		employee e4=new employee(102,"Tanu",32);
		employee e5=new employee(102,"Soni",37);
		
		ArrayList<employee>a1=new ArrayList<employee>();
		
		a1.add(e1);
		a1.add(e2);
		a1.add(e3);
		a1.add(e4);
		a1.add(e5);
		//System.out.println(a1);
		Iterator itr=a1.iterator();
		
		while(itr.hasNext())
		{
			employee emp=(employee)itr.next();
			System.out.println("employee id:"+emp.empid+" employee name:"+emp.empname+"\nemployee age:"+emp.empage);
		}
	}

}