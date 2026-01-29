package vinaya;

import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class WritingFile {
	public static void main(String[] args) {
		try {
			File file = new File("java.txt");
			FileWriter fw = new FileWriter(file);
			fw.write("Hello All!");
			BufferedWriter bw = new BufferedWriter(fw);
			bw.newLine(); // move to next line
			bw.write("This content is written from program.");
			bw.newLine();
			bw.write("Written operation completed successfully.");
			bw.close();
			System.out.println("Data written successfully");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
