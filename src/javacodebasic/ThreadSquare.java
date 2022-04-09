package javacodebasic;

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
public class ThreadSquare extends Thread {
	SharedData sharedData;

	public ThreadSquare(SharedData sharedData) {
		this.sharedData = sharedData;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("T2 >> " + i);

			synchronized (sharedData) {
				try {
					sharedData.notifyAll();
					System.out.println("luong 2 goi notifAll");
					sharedData.wait();
					System.out.println("luong 2 goi wait");
				} catch (InterruptedException ex) {
					Logger.getLogger(ThreadSquare.class.getName()).log(Level.SEVERE, null, ex);
				}
				int rad = sharedData.getRad();
				rad *= rad;
				System.out.println("PT: " + rad);
				try {
					Thread.sleep(100);
				} catch (InterruptedException ex) {
					Logger.getLogger(ThreadRandom.class.getName()).log(Level.SEVERE, null, ex);
				}
			}
		}

		System.out.println("T2 Stop");
		// stop
		synchronized (sharedData) {
			sharedData.notifyAll();
		}
	}

}
