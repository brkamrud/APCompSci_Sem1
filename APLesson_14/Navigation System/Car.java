public abstract class Car implements Location
{
	private double[] location = new double[2];
	public final int ID = (int)(Math.random() * ((999999 - 100000) + 1)) + 100000;
	
	public Car()
	{
		double[] loc = location.clone(); 
	}
	
	public int getID()
	{
		return ID;
	}
	
	public abstract void move(double x, double y);
	
	public double[] getLoc()
	{
		return location;
	}
}