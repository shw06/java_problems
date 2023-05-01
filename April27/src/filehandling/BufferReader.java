package filehandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		try {
			FileReader f1=new FileReader("C:\\Users\\Nilesh\\OneDrive\\Desktop\\Edubridge\\EB.txt");
			BufferedReader br=new BufferedReader(f1);
			int i;
			while((i=br.read())!=-1)
			{
				System.out.println((char)i);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}