package com.dailypractise;

/*Implement a superclass Shape with a method calculateArea(). 
Create subclasses Rectangle and Circle that inherit from Shape and 
override the calculateArea() method to compute the area of the respective shapes.*/

class Shape{
	public void calculateArea(int a)
	{
		System.out.println("Area of Shape");
	}
}
class Rectangle extends Shape{
	public void calculateArea(int a)
	{
		System.out.println("Area of Rectangle"+a);
	}
}
class Circle extends Shape{
	public void calculateArea(int a)
	{
		System.out.println("Area of Circle"+a);
	}
}
public class TestShape {

	public static void main(String[] args) {
		Circle c= new Circle();
		c.calculateArea(10);
		
	}

}
