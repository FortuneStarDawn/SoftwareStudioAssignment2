package shape;

public class Square extends Shape //inherit Shape.java
{
	private double length;
	
	public Square(int input) //constructor
	{
		length = input;
	}
	public double getArea() //get square area
	{
		return length * length;
	}
	public String toString() //get square string
	{
		return "I am a Square and the area is " + getArea();
	}
}
