package filehandling;


import java.io.File;

public class DeleteFile {
	public static void main(String[] args) {
		try {
			
			//create file 
			
			File f1=new File("D:\\Avni\\jj.txt");
			if(f1.delete())
			{
				System.out.println(f1.getName()+"is Deleted successfully");
			}
			else {
				System.out.println("Unexpected Error occur");
			}
}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}
}