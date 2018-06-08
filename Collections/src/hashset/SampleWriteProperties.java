package hashset;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;
import java.util.Scanner;

public class SampleWriteProperties {
	public static void main(String[] args) throws Exception {
		Scanner s = new Scanner(System.in);
		System.out.println("please enter the updated user name");
		String user = s.next();
		System.out.println("please enter the updated password");
		String pwd = s.next();
		FileWriter fw = new FileWriter("E:\\db.properties");
		Properties pr = new Properties();

		pr.setProperty("user", user);
		pr.setProperty("pwd", pwd);
		pr.store(fw, "updated credentials on " + new Date());

	}

}
