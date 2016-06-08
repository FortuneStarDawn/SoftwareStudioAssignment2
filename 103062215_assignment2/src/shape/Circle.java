package shape;

public class Circle extends Shape //inherit Shape.java
{
	private double radius;
	
	public Circle(int input) //constructor
	{
		radius = input;
	}
	public double getArea() //get circle area
	{
		return radius * radius * 3.14;
	}
	public String toString() //get circle string
	{
		return "I am a Circle and the area is " + getArea();
	}
}
