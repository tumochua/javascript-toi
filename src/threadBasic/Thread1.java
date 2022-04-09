package threadBasic;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Diep.Tran
 */
public class Thread1 extends Thread {
	SharedData sharedData;

	public Thread1(SharedData sharedData) {
		this.sharedData = sharedData;
	}

	@Override
	public void run() {
		try {
			Thread.sleep(200);
		} catch (InterruptedException ex) {
			Logger.getLogger(Thread1.class.getName()).log(Level.SEVERE, null, ex);
		}

		Random random = new Random();

		while (sharedData.checkAvaiable()) {
			synchronized (sharedData) {
				int rad = random.nextInt(100) + 1;
				sharedData.setRad(rad);
				sharedData.plus(rad);
				System.out.println("T1 >> " + rad);

				// thiet lap luong tiep theo dc phep chay
				if (rad % 3 == 0) {
					sharedData.setIndex(2);
				} else {
					sharedData.setIndex(3);
				}

				// sync thread
				sharedData.notifyAll();
				try {
					sharedData.wait();
				} catch (InterruptedException ex) {
					Logger.getLogger(Thread1.class.getName()).log(Level.SEVERE, null, ex);
				}
			}
		}
		System.out.println("T1 Stop");
		synchronized (sharedData) {
			sharedData.notifyAll();
		}
	}
}
