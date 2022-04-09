package threadjoin;

public class ThreadTrue extends Thread {

	public ThreadTrue() {
	}

	@Override
	public void run() {

		for (int i = 0; i < 20; i++) {
			System.out.println("luong 2 :" + i);
		}
	}

}
