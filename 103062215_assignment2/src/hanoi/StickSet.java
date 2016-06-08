package hanoi;

public class StickSet
{
	private Stick left, middle, right;
	
	public StickSet()
	{
		left = new Stick("Left"); //new a stick with position "Left"
		middle = new Stick("middle"); //new a stick with position "middle"
		right = new Stick("right"); //new a stick with position "right"
	}
	

	
	public String toString(int ringNumber)
	{
		String from, to, re;
		from = left.getPosition(); //from = the position of left
		to = right.getPosition(); //to = the position of right
		re = "moveRing ring " + ringNumber + " from " + from + " to " + to; //re = the output string
		return re;
	}
	
	public void moveRing(int ringNumber) //suppose the condition that only two stick, and do it recursively
	{
		    //first time will go to else
	        if(ringNumber==1) System.out.println(toString(1));
	        else
	        {
	        		middle.switchPosition(right); //turn the order to "Left", "right", "middle"
	                moveRing(ringNumber-1); //print ring 1 from "Left" to "middle"
	                middle.switchPosition(right); //turn the order to "Left", "middle", "right"
	                System.out.println(toString(ringNumber)); //print ring 2 from "Left" to "right"
	                left.switchPosition(middle); //turn the order to "middle", "Left", "right"
	                moveRing(ringNumber-1); //print ring 1 from "middle" to "right"
	                left.switchPosition(middle); //turn the order to "Left", "middle", "right"
	        }
	}
	
}
