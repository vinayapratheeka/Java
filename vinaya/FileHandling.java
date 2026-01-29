package vinaya;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;

public class FileHandling {
	public static void main(String[] args) {
		try {
			File file = new File("tech.txt");//creating the file
			if(file.createNewFile()) {
				System.out.println("File created Successfully");
			}
			else {
				System.out.println("File already exists");
			}
			
			FileWriter writer = new FileWriter(file);//writing the file
			writer.write("Hello Vinaya!\n");
			writer.write("This is Java File Handling.\n");
			writer.close();
			System.out.println("Data written into file successfully");
			
			BufferedWriter bw = new BufferedWriter(new FileWriter(file));
			//BufferedWriter bw = new BufferedWriter(file);
			bw.write("Hello Vinaya!");
			bw.newLine();
			bw.write("This file is created, written and read in same program.");
			bw.newLine();
			bw.write("Now writing using BufferedWriter.");
			bw.close();   
			
			FileReader reader = new FileReader(file);//reading the file
			int ch;
			System.out.println("\nReading data from file:");
			while ((ch = reader.read()) != -1) {
				System.out.print((char) ch);
			}
			reader.close();
			
			BufferedReader br = new BufferedReader(new FileReader(file));//reading using BufferedReader
			String line;
			System.out.println("\nReading data from file:");
			while((line=br.readLine())!=null) {
				System.out.println(line);
			}
			br.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}

}
