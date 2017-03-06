public class Toyota implements Location
{
	private double[] location = new double[2];
	
	public Toyota()
	{
		location[0] = 0;
		location[1] = 1;
	}
	
	public Toyota(String coordinates)
	{
		String[] cd = coordinates.split(", ");
		location = Double.parseDouble(cd);
	}
}