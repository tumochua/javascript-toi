package ThreadsJavatPoint;

//public class TestMain {
//
//	public static void main(String[] args) {
//		Multi t = new Multi();
//		Thread th1 = new MainThreads(t);
//		Thread th2 = new Threads3(t);
//		th1.start();
//		th2.start();
//
//	}
//
//}

class TestMain {
	int amount = 10000;

	synchronized void withdraw(int amount) {

		System.out.println("se rut...");
		if (this.amount < amount) {
			System.out.println("so du ít hon , so tien muon rut...");
			try {
				wait();
				this.amount -= amount;
				System.out.println("rut tien thanh cong...");
			} catch (Exception e) {
			}
		}
	}

	synchronized void deposit(int amount) {
		System.out.println("sap dat coc...");
		this.amount += amount;
		System.out.println("gui tien thanh cong... ");
		notify();
	}
}
