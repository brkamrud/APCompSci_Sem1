import java.lang.Math.*;

public class MilesPerHour
{
	private int distance, hours, minutes;
	private double mph;
	
	public MilesPerHour() //Default Constructor
	{
		distance = 0;
		hours = 0;
		minutes = 0;
		mph = 0;
	}
	
	public MilesPerHour(int dis, int hr, int min) //Constructor w/ Params
	{
		distance = dis;
		hours = hr;
		minutes = min;
		mph = 0;
	}
	
	public void setValues(int dis, int hr, int min) //Modifier
	{
		distance = dis;
		hours = hr;
		minutes = min;
		mph = 0;
	}
	
	//Accessors
	
	public int getDistance()
	{
		return distance;
	}
	
	public int getHours()
	{
		return hours;
	}
	
	public int getMinutes()
	{
		return minutes;
	}
	
	public double getMPH()
	{
		mph = Math.round(distance / (hours + minutes / 60.0));
		return mph;
	}
	
	
}