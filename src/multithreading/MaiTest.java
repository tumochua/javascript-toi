package multithreading;

public class MaiTest {

	public static void main(String[] args) {

		Thread r1 = new ThreadName();
		Thread r2 = new TestThread();
		r1.start();

		r2.start();
//		try {
//			r2.join();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		for (int i = 0; i < 10; i++) {
			System.out.println("main :" + i);
			System.out.println("r1 :" + r1.isAlive());
			System.out.println("r2 :" + r2.isAlive());

		}

	}
}
