package multithreading;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		MyBank bank = new MyBank(1000);

		bank.withDraw(800, "t0");
		bank.withDraw(800, "t1");
		bank.withDraw(800, "t2");

		List<WithDrawThread> th = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			th.add(new WithDrawThread(bank, "T" + i));

		}

		for (WithDrawThread withDrawThreadName : th) {
			withDrawThreadName.start();
		}

//		WithDrawThread with = new WithDrawThread(bank, "t");
//		with.display();
	}

}
