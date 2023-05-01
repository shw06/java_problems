package filehandling;

import java.io.FileOutputStream;

public class FileOut {

	public static void main(String[] args) {
		
//passing or writing data in the form array
		try {
			//FileOutputStream write the data suppose if file is not their it will create
			FileOutputStream  fo=new FileOutputStream("C:\\Users\\Nilesh\\OneDrive\\Desktop\\Edubridge\\employee.txt");
			String s="1.Java is puerly OOPSlanguage.2.Java is Platform indepedent";
			//converting string into Array byte
			byte b[]=s.getBytes();
			fo.write(b);
			fo.close();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}