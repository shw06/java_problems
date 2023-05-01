package filehandling;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DepersistData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			
			ObjectInputStream in=new ObjectInputStream(new FileInputStream("C:\\Users\\Nilesh\\OneDrive\\Desktop\\Edubridge\\student.txt"));
			
			Student s=(Student)in.readObject();
			System.out.println(s.id+" "+s.name);
			in.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}