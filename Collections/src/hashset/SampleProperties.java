package hashset;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class SampleProperties {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("E:\\db.properties");
		Properties pr = new Properties();
		pr.load(fr);
		System.out.println(pr.getProperty("user"));
		System.out.println(pr.getProperty("pwd"));
		System.out.println(pr.getProperty("url", "no url found"));

		System.out.println(pr.getProperty("mahesh"));
	}

}
