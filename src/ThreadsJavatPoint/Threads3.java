package ThreadsJavatPoint;

public class Threads3 extends Thread {

	Multi t;

	Threads3(Multi t) {
		this.t = t;
	};

	@Override
	public void run() {
		t.pritTest(10);
	}

}
