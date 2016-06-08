package shape;

import java.util.Scanner;
import java.util.Arrays; //use to sort

public class AreaCalculator
{	
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in); //scanner
		instance = getInstance(); //get the instance of AreaCalculator
		System.out.println("Please input four integers:");
		while(in.hasNext())
		{
			instance.rectangle = new Rectangle(in.nextInt(), in.nextInt()); //get the height and width of rectangle
			instance.square = new Square(in.nextInt()); //get the length of square
			instance.circle = new Circle(in.nextInt()); //get the radius of circle
			instance.shapeBox = new Shape[] {instance.rectangle, instance.square, instance.circle}; //store them in to an array
			System.out.println("The area of rectangle A:" + instance.rectangle.getArea()); //print the rectangle area
			System.out.println("The area of square B:" + instance.square.getArea()); //print the square area
			System.out.println("The area of circle C:" + instance.circle.getArea()); //print the circle area
			if(instance.rectangle.compareTo(instance.square)>0) System.out.println("Rectangle A is larger than square B."); //A>B
			else if(instance.rectangle.compareTo(instance.square)==0) System.out.println("Rectangle A is equal to square B."); //A=B
			else System.out.println("Rectangle A is smaller than square B."); //A<B
			System.out.println("The sum of A&C is " + sumOfArea(instance.rectangle, instance.circle)); //A+C
			System.out.println("The sum of A&B is " + sumOfArea(instance.rectangle, instance.square)); //A+B
			System.out.println("The sum of B&C is " + sumOfArea(instance.square, instance.circle)); //B+C
			System.out.println("The sum of A&B&C is " + sumOfArea(instance.rectangle, instance.square, instance.circle)); //A+B+C
			Arrays.sort(instance.shapeBox); //sort the array by compareTo
			for(int i=0; i<3; i++) System.out.println(instance.shapeBox[i].toString()); //print the string by ascending order
			System.out.println("Please input four integers:");
		}
		in.close();
	}
	
	private static AreaCalculator instance;
	private Rectangle rectangle;
	private Square square;
	private Circle circle;
	private Shape[] shapeBox;
	
	public static AreaCalculator getInstance()
	{
		if(instance == null) instance = new AreaCalculator(); //if instance has not been new, new it
		return instance;
	}
	public static double sumOfArea(Shape shape1, Shape shape2)
	{
		return shape1.getArea() + shape2.getArea(); //return area1 + area2
	}
	public static double sumOfArea(Shape shape1, Shape shape2, Shape shape3)
	{
		return shape1.getArea() + shape2.getArea() + shape3.getArea(); //return area1 + area2 + area3
	}
}
