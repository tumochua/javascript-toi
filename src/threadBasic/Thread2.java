package threadBasic;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Diep.Tran
 */
public class Thread2 extends Thread {
	SharedData sharedData;

	public Thread2(SharedData sharedData) {
		this.sharedData = sharedData;
	}

	@Override
	public void run() {
		while (sharedData.checkAvaiable()) {
			synchronized (sharedData) {
				sharedData.notifyAll();
				try {
					while (sharedData.getIndex() != 2 && sharedData.checkAvaiable()) {
						sharedData.wait();
					}
				} catch (InterruptedException ex) {
					Logger.getLogger(Thread2.class.getName()).log(Level.SEVERE, null, ex);
				}

				int rad = sharedData.getRad();
				if (rad % 3 == 0) {
					rad *= rad;
					System.out.println("T2 >> " + rad);
				}

				sharedData.setIndex(1);
			}
		}
		System.out.println("T2 Stop");
		synchronized (sharedData) {
			sharedData.notifyAll();
		}
	}
}
