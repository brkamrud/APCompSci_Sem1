import java.util.Scanner;
import java.text.DecimalFormat;

public class Ex_04
{
	public static void main(String[]args)
	{
		Ex_04 method = new Ex_04();
		Scanner kb = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat(".00");
		
		System.out.println("Enter the height in inches:");
		double height = kb.nextDouble();
		
		System.out.println("Enter the width in inches:");
		double width = kb.nextDouble();
		
		System.out.println("Enter the length in inches:");
		double length = kb.nextDouble();
		
		double volume = method.calcVol(height, width, length);
		
		System.out.println("Your volume is " + df.format(volume) + " Cubic Feet.");
	}
	public double calcVol(double x, double y, double z)
	{
		double vol1 = x * y * z;
		double vol2 = vol1 / 1728;
		return vol2;
	}
}