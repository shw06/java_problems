package filehandling;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Persistdata {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Student s1=new Student(101,"Ajay");
			
			FileOutputStream fout=new FileOutputStream("C:\\Users\\Nilesh\\OneDrive\\Desktop\\Edubridge\\student.txt");
			ObjectOutputStream out= new ObjectOutputStream(fout);
			out.writeObject(s1);
			out.flush();//flush means clear
			out.close();
			System.out.println("Successfully data gets added");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	

}
