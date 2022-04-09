package threadjoin;

public class ThreadOne extends Thread {

	ThreadTrue th;

	public ThreadOne(Thread th) {
		this.th = (ThreadTrue) th;
	}

	@Override
	public void run() {
		try {
			th.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for (int i = 0; i < 20; i++) {
			System.out.println("luong 1 " + i);
		}
	}

}
