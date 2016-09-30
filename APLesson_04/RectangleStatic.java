import java.util.Scanner;
import java.text.DecimalFormat;

public class RectangleStatic
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat(".#####");
		
		System.out.println("Enter the width of your rectangle:");
		double width = kb.nextDouble();
		
		System.out.println("Enter the length:");
		double length = kb.nextDouble();
		
		double perimeter = calcPerim(width, length);
		
		System.out.println("Your rectangle is " + df.format(perimeter) + " sq ft around.");
		
	}
	
	public static double calcPerim(double w, double l)
	{
		return (w * 2) + (l * 2);
		
	}
	
}