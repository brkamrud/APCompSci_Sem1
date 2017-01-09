import java.lang.Math.*;
public class Distance
{
	private int xOne, xTwo, yOne, yTwo;
	private double distance;
	
	public Distance() //Default Constructor
	{
		xOne = 0;
		xTwo = 0;
		yOne = 0;
		yTwo = 0;
		distance = 0;
	}
	
	public Distance(int x1, int x2, int y1, int y2) //Constructor w/ Params
	{
		xOne = x1;
		xTwo = x2;
		yOne = y1;
		yTwo = y2;
		distance = 0;
	}
	
	public void setValues(int x1, int x2, int y1, int y2) //Modifier
	{
		xOne = x1;
		xTwo = x2;
		yOne = y1;
		yTwo = y2;
	}
	
	//Accessors
	public int getX1()
	{
		return xOne;
	}
	
	public int getX2()
	{
		return xTwo;
	}
	
	public int getY1()
	{
		return yOne;
	}
	
	public int getY2()
	{
		return yTwo;
	}
	
	public double getDist()
	{
		distance = Math.sqrt((xTwo - xOne) * (xTwo - xOne) + (yTwo - yOne) * (yTwo - yOne));
		return distance;
	}
	
}