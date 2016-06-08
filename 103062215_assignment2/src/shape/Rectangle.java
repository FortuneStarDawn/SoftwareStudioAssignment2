package shape;

public class Rectangle extends Shape //inherit Shape.java
{
	private double height, width;
	
	public Rectangle(int input1, int input2) //constructor
	{
		height = input1;
		width = input2;
	}
	public double getArea() //get rectangle area
	{
		return height * width;
	}
	public String toString() //get rectangle string
	{
		return "I am a Rectangle and the area is " + getArea();
	}
}
