package threadjoin;

public class TestMain {

	public static void main(String[] args) {
		ThreadTrue th2 = new ThreadTrue();
		ThreadOne th1 = new ThreadOne(th2);
		th1.start();
		th2.start();
	}

}
