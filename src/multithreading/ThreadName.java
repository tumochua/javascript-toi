package multithreading;

public class ThreadName extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("ThreadName r1 : " + i);
//			try {
//				Thread.sleep(500);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
			System.out.println("r1 >>> " + isAlive());

		}
	}

//	public static void main(String[] args) {
//		Runnable run1 = new ThreadName();
//		Thread run2 = new Thread(run1);
//		System.out.println(run2.isAlive());
//		run2.start();
//		System.out.println(run2.getName());
////		run2.stop();
//	}
}
