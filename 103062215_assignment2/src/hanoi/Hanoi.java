package hanoi;

import java.util.Scanner;

public class Hanoi
{
	public static void main(String args[])
	{
	        int ringNumber; //the total ring want to move
	        StickSet stickSet = new StickSet(); //new a StickSet with three sticks
	        Scanner in = new Scanner(System.in);
	        System.out.println("Please input an integer:"); 
	        while(in.hasNext())
	        {
	        	ringNumber = in.nextInt(); //get input to ringNumber
		        stickSet.moveRing(ringNumber); //call moveRing in stickSet
		        System.out.println("Please input an integer:");
	        }
	        in.close();
	} 

}