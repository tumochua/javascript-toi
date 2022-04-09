package ThreadsJavatPoint;

public class MainThreads extends Thread {
	Multi t;

	MainThreads(Multi t) {
		this.t = t;
	};

	@Override
	public void run() {
		t.pritTest(10);
	}

}
