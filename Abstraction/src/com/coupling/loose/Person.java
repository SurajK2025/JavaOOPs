package com.coupling.loose;

public class Person {
	public static void main(String[] args) {
		Transport busTransport = new Bus();
		Transport trainTransport = new Train();
		
		Travel travel = new Travel(busTransport);
		travel.startTravel();
	}
}
