package file.input;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class SampleObjectRead {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fs = new FileInputStream("C:\\Users\\Admin\\Desktop\\File.txt");
		ObjectInputStream o = new ObjectInputStream(fs);
		Object ob = o.readObject();
		if (ob instanceof User) {
			User u = (User) ob;
			System.out.println(u.userId + " " + u.userName + " " + u.age);
		}
		o.close();
		fs.close();

	}

}
