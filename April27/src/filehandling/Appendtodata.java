package filehandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Appendtodata {

		public static void main(String[] args) {

		String texttoAppend="SVFBTE";
		String filepath="C:\\Users\\Nilesh\\OneDrive\\Desktop\\Edubridge\\employee.txt";
		
		try(FileWriter fw=new FileWriter(filepath,true)) {
			PrintWriter print=new PrintWriter(fw);
			print.println(texttoAppend);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
