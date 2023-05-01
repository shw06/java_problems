package filehandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriterClass {

	public static void main(String[] args) {
		
		try {
			FileWriter writer=new FileWriter("C:\\Users\\Nilesh\\OneDrive\\Desktop\\Edubridge\\EB.txt");
			BufferedWriter buffer=new BufferedWriter(writer);
			buffer.write("Welcome to Edubridge ");
			buffer.close();
			System.out.println("Successfully written");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}