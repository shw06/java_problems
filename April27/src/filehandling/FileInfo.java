package filehandling;

import java.io.File;

public class FileInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File f1=new File("C:\\Users\\Nilesh\\OneDrive\\Desktop\\Edubridge\\test.txt");
		if(f1.exists())
		{
			//getting file name
			//getName() inbuilt method used to display file name
			
			System.out.println("The Name of file:"+f1.getName());
			//check exact path where file get created
			System.out.println("The Exact path of My file is:"+f1.getAbsolutePath());
			
			//writable mode or not
			System.out.println("TheFile is in Writable Mode??:"+f1.canWrite());
			//readable mode or not
			System.out.println("TheFile is in Readable Mode??:"+f1.canRead());
		}
		else
		{
			System.out.println("File Does not exist");
		}
		
	}

}