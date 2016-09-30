import java.util.Scanner;
import java.text.DecimalFormat;

public class Cube
{
	static DecimalFormat df = new DecimalFormat(".#####");
	static Scanner kb = new Scanner(System.in);
	
	public static void main(String[]args)
	{
		Cube method = new Cube();
		
		System.out.println("Enter the length of your cube:");
		double length = kb.nextDouble();
		
		double surfaceArea = method.calcSurf(length);
		method.print(surfaceArea, length);
		
	}
	
	public double calcSurf(double L)
	{
		double sa = 6 * (Math.pow(L, 2));
		return sa;
		
		
	}
	
	public void print(double x, double y)
	{
		System.out.println("The surface area of a cube with " + y + " feet sides is " + df.format(x) + ".");
		
		
	}
	
	
}