package com.dailypractise;
/*
 * Create a superclass Vehicle with attributes make and model. 
 * Create a subclass Car
 *  that inherits from Vehicle and adds an additional attribute year.
 */

class Vehicle{
	public void make()
	{
		System.out.println("making car");
	}
	public void model()
	{
		System.out.println("model number");
	}
}

class Car extends Vehicle
{
	public void year() {
		System.out.println("year");
	}
}

public class TestVehicle {

	public static void main(String[] args) {
		Car c=new Car();
		c.make();
		c.year();
		c.model();
	}

}
