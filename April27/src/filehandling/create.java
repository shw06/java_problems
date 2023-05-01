package filehandling;

import java.io.File;

public class create {

	public static void main(String[] args) {
		try {
			File f1=new File("C:\\Users\\Nilesh\\OneDrive\\Desktop\\Edubridge\\test.txt");
			if(f1.createNewFile()) {
				System.out.println("File "+f1.getName()+" created successfully.");
			}
			else {
				System.out.println("File already exists.");
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}