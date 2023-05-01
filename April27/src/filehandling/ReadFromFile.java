package filehandling;
import java.io.File;
import java.util.Scanner;

public class ReadFromFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			

			File f1=new File("D:\\Avni\\Demo.txt");
			Scanner sc=new Scanner(f1);
			
			while(sc.hasNextLine())
			{
				String Data=sc.nextLine();
				System.out.println(Data);
			}
		}
		catch(Exception e)
		{
			
		}
	}

}