import java.util.Scanner;
import java.text.DecimalFormat;

public class CubeStatic
{
	static DecimalFormat df = new DecimalFormat(".#####");
	static Scanner kb = new Scanner(System.in);
	
	public static void main(String[]args)
	{
		System.out.println("Enter the length of your cube:");
		double length = kb.nextDouble();
		
		double surfaceArea = calcSurf(length);
		print(surfaceArea, length);
		
	}
	
	public static double calcSurf(double L)
	{
		double sa = 6 * (Math.pow(L, 2));
		return sa;
		
		
	}
	
	public static void print(double x, double y)
	{
		System.out.println("The surface area of a cube with " + y + " feet sides is " + df.format(x) + ".");
		
		
	}
	
	
}