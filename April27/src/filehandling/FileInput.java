package filehandling;

import java.io.FileInputStream;

public class FileInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			FileInputStream fin=new FileInputStream("C:\\Users\\Nilesh\\OneDrive\\Desktop\\Edubridge\\employee.txt");
			
			int i=1;
			while((i=fin.read())!=-1) {
				System.out.println((char)i);
			}
			fin.close();
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}

