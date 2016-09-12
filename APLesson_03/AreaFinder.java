import java.util.Scanner;

public class AreaFinder
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		double w;
		double l;
		
		System.out.println("Please enter your width.");
		w = keyboard.nextDouble();
		
		System.out.println("Please enter your length.");
		l = keyboard.nextDouble();
		
		Double area = w * l;
		System.out.println("Your area is " + area + ".");
	}
}