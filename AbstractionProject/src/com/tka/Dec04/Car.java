package com.tka.Dec04;

public class Car implements Vehicle {
	@Override
	public void start() {
		System.out.println("Car was start");
	}

	@Override
	public void stop() {
		System.out.println("Car was stop");
		
	}
	public void m1() {
		System.out.println("A is: "+a);
	}

	@Override
	public void getMileage(int distance, int fuel) {
		System.out.println("Distance: "+distance);
		System.out.println("Fuel: "+fuel);
		
	}

	@Override
	public void showDetails(String model, double price) {
		System.out.println("Model:  "+model);
		System.out.println("Price:  "+price);
		
	}
}
