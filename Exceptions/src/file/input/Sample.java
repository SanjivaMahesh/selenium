package file.input;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Sample {
	public static void main(String[] args) {
		FileInputStream f = null;
		try {
			f = new FileInputStream("File.txt");
			int x = 0;
			while ((x = f.read()) != -1) {
				System.out.print((char) x);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
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
	}

}
