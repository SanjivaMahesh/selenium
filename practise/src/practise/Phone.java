package practise;

public class Phone {

	void receiveCall() {
		System.out.println("open keypad");
		System.out.println("touch the numbers");
		System.out.println("touch the dial button on screen");
	}

	void receiveCall(Voice v) {
		System.out.println("open true caller app");
		System.out.println("touch the numbers");
		System.out.println("touch the dial button on screen");
	}

	public static void main(String[] args) {
		Phone p = new Phone();
		p.receiveCall();
		p.receiveCall(new Voice());
	}

}
