package com.coupling.loose;

public class Travel {
	private Transport transport;
	
	public Travel(Transport transport) {
		this.transport = transport;
	}
	
	public void startTravel() {
		transport.start();
	}
	
}
