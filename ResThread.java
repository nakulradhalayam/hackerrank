package com.hackerrank.algorithms;

public class ResThread implements Runnable {

	int seats;
	SeatReservationServer server = new SeatReservationServer();
	public  ResThread(int seats) {
		this.seats=seats;
	}
	
	@Override
	public void run() {
 		server.bookSeats(seats);
	}

}
