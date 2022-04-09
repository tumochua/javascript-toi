package threadBasic;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Diep.Tran
 */
public class Main {
	public static void main(String[] args) {
		SharedData sharedData = new SharedData();

		Thread1 t1 = new Thread1(sharedData);
		Thread2 t2 = new Thread2(sharedData);
		Thread3 t3 = new Thread3(sharedData);

		System.out.println("t1 thread priority : " + t1.getPriority());
		System.out.println("t2 thread priority : " + t2.getPriority());
		System.out.println("t3 thread priority : " + t3.getPriority());

		t1.start();
		t2.start();
		t3.start();
	}
}
