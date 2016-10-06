import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercise_02
{
	static DecimalFormat df = new DecimalFormat(".##");
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter the name of your first item:");
		String item1 = kb.nextLine();
		System.out.println("Enter the price of your first item:");
		double price1 = kb.nextDouble();
		
		System.out.println("Enter the name of your second item:");
		String item2 = kb.nextLine();
		System.out.println("Enter the price of your second item:");
		double price2 = kb.nextDouble();
		
		System.out.println("Enter the name of your third item:");
		String item3 = kb.nextLine();
		System.out.println("Enter the price of your third item:");
		double price3 = kb.nextDouble();
		
		System.out.println("Enter the name of your fourth item:");
		String item4 = kb.nextLine();
		System.out.println("Enter the price of your fourth item:");
		double price4 = kb.nextDouble();
		
		double subTotal = price1 + price2 + price3 + price4;
		double disc = discount(subTotal);
		
		double total = subTotal - disc + (subTotal * .07);
		
		format(item1, price1);
		
	}
	
	public static double discount(double x)
	{
		
		if(x >= 2000)
		{
			double y = x * .15;
		}
		
		if(x < 2000)
		{
			double y = x * 0;
		}
		
		return y;
		
	}
	
	public static void format(String item, double price)
	{
		System.out.printf("\n%18s          %10.2", item, price);
		
	}
	
}