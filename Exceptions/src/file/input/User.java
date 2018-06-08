package file.input;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class User implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6824970503429919631L;
	transient int age;
	transient String userId;
	transient String userName;

	public User(int age, String userId, String userName) {
		super();
		this.age = age;
		this.userId = userId;
		this.userName = userName;

	}

	public static void main(String[] args) throws IOException {
		User u = new User(25, "id123", "Mahesh");
		FileOutputStream f = new FileOutputStream("C:\\Users\\Admin\\Desktop\\File.txt");
		ObjectOutputStream os = new ObjectOutputStream(f);
		os.writeObject(u);
		os.flush();
		f.flush();
		os.close();
		f.close();
		System.out.println("Succesfully written object to the file");
	}

}
