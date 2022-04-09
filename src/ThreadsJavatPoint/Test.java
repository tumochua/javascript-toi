package ThreadsJavatPoint;

class Test extends Thread {

	@Override
	public void run() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void main(String args[]) {
		Thread th = new Test();
		th.start();

	}
}
