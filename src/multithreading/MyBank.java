package multithreading;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Diep.Tran
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Diep.Tran
 */
public class MyBank {
	int money;

	public MyBank() {
	}

	public MyBank(int money) {
		this.money = money;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public synchronized void withDraw(int money, String threadName) {
		if (money <= this.money) {
			System.out.println("So tien rut : " + money + ", Thread : " + threadName);
			this.money -= money;
		} else {
			System.out.println("So tien rut vuot qua so tien hien tai" + ", Thread : " + threadName);
		}
		System.out.println("So tien hien tai: " + this.money);
	}
}
