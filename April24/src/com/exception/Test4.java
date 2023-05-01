package com.exception;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	String name=null;
	System.out.println(name.length());
	String []emp=new String[5];
		
		emp[0]="Jhon";
		emp[1]="sam";
		emp[9]="Aniket";
		for(int i=0;i<emp.length;i++)
		{
			System.out.println(emp[i]);
		}
		
	}

         catch(ArithmeticException e1)
    {
	e1.printStackTrace();  
}
       catch(NullPointerException e1)
    {
	e1.printStackTrace();  
}
      catch(ArrayIndexOutOfBoundsException e1)
{
    	  e1.printStackTrace();    
}
//it will execute whether error is their or not 
//wheteher to handle error catch block is present or not
//in all situation finally block will execute
finally {
	System.out.println("This is finally block");
}
	}

}