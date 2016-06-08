package hanoi;

public class Stick
{
	private String position;
	
	public Stick(String input) //constructor
	{
		position = input;
	}
	
	public String getPosition() //get position
	{
		return position;
	}
	
	public void setPosition(String input) //set position
	{
		position = input;
	}
	
	public void switchPosition(Stick that) //exchange the position of two sticks
	{
		String temp;
		temp = getPosition();
		setPosition(that.getPosition());
		that.setPosition(temp);
	}
	
}
