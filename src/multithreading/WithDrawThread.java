package multithreading;

public class WithDrawThread extends Thread {
	String name;
	MyBank myBank;

	public WithDrawThread(MyBank myBank, String name) {
		this.myBank = myBank;
		this.name = name;
	}

//	public void display() {
//		System.out.println("check " + this.myBank);
//	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			myBank.withDraw(800, name);
		}
	}

	@Override
	public String toString() {
		return "WithDrawThread [name=" + name + ", myBank=" + myBank + "]";
	}

}
