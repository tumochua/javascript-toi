package javacodebasic;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Diep.Tran
 */
public class Test2 {
	public static void main(String[] args) {
		SharedData sharedData = new SharedData();

		ThreadRandom threadRandom = new ThreadRandom(sharedData);
		ThreadSquare threadSquare = new ThreadSquare(sharedData);

		threadSquare.start();
		threadRandom.start();
	}
}
