package multithreading;

public class TestThread extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("TestThread r2 : " + i);
			try {
				join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
//			try {
//				Thread.sleep(500);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}

		}
		System.out.println(isAlive());
	}

//	public static void main(String[] args) {
//		Thread t = new TestThread();
//		t.start();
//		System.out.println("name" + t.getName());
//	}

}
