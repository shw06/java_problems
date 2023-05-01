package filehandling;

import java.io.File;
import java.io.FileWriter;

public class WriteToFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
			
			//create file 

			 
			FileWriter fwrite=new FileWriter("C:\\Users\\Nilesh\\OneDrive\\Desktop\\Edubridge\\test.txt");
			fwrite.write("Hello All good evening ,please focus towords the session");
			fwrite.close();
			
			
			
	}
catch(Exception e)
{
	e.printStackTrace();
}

}
}