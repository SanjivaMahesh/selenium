package file.writer;

import java.io.FileWriter;
import java.io.IOException;

public class Sample {

	public static void main(String[] args) {
		FileWriter f = null;
		try {
			f = new FileWriter("File.txt");
			String message = "Hai Mahesh";
			f.write(message);
			f.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (f != null) {
				try {
					f.close();
					f = null;
				} catch (Exception e) {
					e.printStackTrace();
				}

			}
		}
		System.out.println("Message sent");

	}

}
