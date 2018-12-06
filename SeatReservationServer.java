package com.hackerrank.algorithms;

public class SeatReservationServer {
	
	private static int noOfSeats =10;
	
	public void bookSeats(int seats)
	{
		if(seats>noOfSeats)
		{
			System.out.println("Sorry, requested seats are not available");
		}
		else
		{
			noOfSeats = noOfSeats-seats;
			System.out.println("Successfully booked the tickets");
		}
	}

}
