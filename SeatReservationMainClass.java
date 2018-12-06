package com.hackerrank.algorithms;

public class SeatReservationMainClass {

	public static void main(String[] args) throws InterruptedException {

		
		Thread res1 = new Thread(new ResThread(6));
		//ResThread res1 = ;
		Thread res2 = new Thread(new ResThread(7));
		res1.start();
		Thread.sleep(10000);
		res2.start();
	}

}
