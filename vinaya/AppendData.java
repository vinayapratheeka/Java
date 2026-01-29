package vinaya;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class AppendData {
	public static void main(String[] args) {
		try {
			File f = new File("file.txt");
			FileWriter fw = new FileWriter(f);
			fw.write("Hello everyone!");
			fw.write(System.lineSeparator());
			fw.close();
			// append mode = true
			BufferedWriter b = new BufferedWriter(new FileWriter(f, true));

			// append(String)
			b.append("Hello Java");

			b.newLine();

			// append(char)
			b.append('A');

			b.newLine();

			// append(CharSequence, int start, int end)
			b.append("BufferedWriterExample", 0, 14);
			b.close();
			System.out.println("Data appended successfully");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
