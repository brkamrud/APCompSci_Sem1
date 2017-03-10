public class Toyota extends Car
{
	private double[] location = new double[2];
	
	public Toyota()
	{
		location[0] = 0;
		location[1] = 0;
	}
	
	public Toyota(String coordinates)
	{
		String[] cd =  new String[2];
		cd = coordinates.split(", ");
		location[0] = Double.parseDouble(cd[0]);
		location[1] = Double.parseDouble(cd[1]);
	}
	
	public int getID()
	{
		return (int)(Math.random() * ((999999 - 100000) + 1)) + 100000;
	}
	
	public void move(double x, double y)
	{
		x = location[0];
		y = location[1];
	}
	
	public double[] getLoc()
	{
		return location;
	}
}