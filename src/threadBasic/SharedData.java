package threadBasic;

public class SharedData {

	/*
	 * To change this license header, choose License Headers in Project Properties.
	 * To change this template file, choose Tools | Templates and open the template
	 * in the editor.
	 */

	/**
	 *
	 * @author Diep.Tran
	 */
	int rad;
	int total;
	// index = 1, 2, 3
	// 1 => Thread 1
	// 2 => Thread 2
	// 3 => Thread 3
	int index;

	public SharedData() {
		total = 0;
		index = 1;
	}

	public int getRad() {
		return rad;
	}

	public void setRad(int rad) {
		this.rad = rad;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public synchronized void plus(int value) {
		total += value;
	}

	public synchronized boolean checkAvaiable() {
		return total < 2000;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

}
