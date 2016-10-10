import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercise_02
{
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter the name of your first item:");
		String item1 = kb.nextLine();
		System.out.println("Enter the price of your first item:");
		double price1 = kb.nextDouble();
		kb.nextLine();
		
		System.out.println("Enter the name of your second item:");
		String item2 = kb.nextLine();
		System.out.println("Enter the price of your second item:");
		double price2 = kb.nextDouble();
		kb.nextLine();
		
		System.out.println("Enter the name of your third item:");
		String item3 = kb.nextLine();
		System.out.println("Enter the price of your third item:");
		double price3 = kb.nextDouble();
		kb.nextLine();
		
		System.out.println("Enter the name of your fourth item:");
		String item4 = kb.nextLine();
		System.out.println("Enter the price of your fourth item:");
		double price4 = kb.nextDouble();
		
		double subTotal = price1 + price2 + price3 + price4;
		double disc = discount(subTotal);
		double tax = subTotal * .07;
		
		double total = subTotal - disc + tax;
		
		System.out.println("<<<<<<<<<<< Receipt >>>>>>>>>>>");
		format(item1, price1);
		format(item2, price2);
		format(item3, price3);
		format(item4, price4);
		format("Subtotal", subTotal);
		format("Discount", disc);
		format("Tax", tax);
		format("TOTAL", total);
		System.out.println("\n_______________________________");
		System.out.println("<<<<<<<<<< Thank You >>>>>>>>>>");
	}
	
	public static double discount(double x)
	{
		double y = x;
		
		if(x >= 2000)
		{
			y = x * .15;
		}
		
		if(x < 2000)
		{
			y = x * 0;
		}
		
		return y;
		
	}
	
	public static void format(String item, double price)
	{
		System.out.printf("\n%10s          %10.2f", item, price);
		
	}
	
}