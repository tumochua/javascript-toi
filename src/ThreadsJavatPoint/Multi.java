package ThreadsJavatPoint;

public class Multi {
	synchronized void pritTest(int n) {
		for (int i = 0; i < 10; i++) {
			System.out.println(n * i);
			try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	};

}
