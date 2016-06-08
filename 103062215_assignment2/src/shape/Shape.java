package shape;

public abstract class Shape implements Comparable<Shape> //implement compareTo
{

	public abstract double getArea();

	public abstract String toString();

	public int compareTo(Shape that) //implement compareTo in Shape
	{
		if(getArea()>that.getArea()) return 1; //if greater, return 1
		else if(getArea()==that.getArea()) return 0; //if equal, return 0
		else return -1; //if smaller, return -1
	}
}
