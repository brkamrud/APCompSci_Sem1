public class GMC implements Location
{
	private double x, y;
	
	public GMC()
	{
		x = 0;
		y = 0;
	}
	
	public GMC(double x1, double y1)
	{
		this.x = x1;
		this.y = y1;
	}
	
	public int getID()
	{
		return (int)(Math.random() * ((999999 - 100000) + 1)) + 100000;
	}
	
	public void move(double x2, double y2)
	{
		this.x = x2;
		this.y = y2;
	}
	
	public double[] getLoc()
	{
		double[] location = new double[2];
		location[0] = this.x;
		location[1] = this.y;
		return location;
	}
}