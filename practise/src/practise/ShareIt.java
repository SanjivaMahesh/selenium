package practise;

public class ShareIt {

	void Receive(Photo p) {
		System.out.println("select it");
		System.out.println("send it through ShareIt app");
	}

	void Receive(Video v) {
		System.out.println("open ShareIt app");
		System.out.println("Then select it to Share ");
	}

	public static void main(String[] args) {
		ShareIt s = new ShareIt();
		s.Receive(new Photo());
		s.Receive(new Video());
	}
}
