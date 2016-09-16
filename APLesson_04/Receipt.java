import java.util.Scanner;

public class Receipt
{
	public static void main(String[]args)
	{
		Receipt form = new Receipt();
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter item 1:");
		String food1 = kb.nextLine();
		
		System.out.println("Please enter the price:");
		double price1 = kb.nextDouble();
		
		System.out.println("Please enter item 2:");
		kb.nextLine();
		String food2 = kb.nextLine();
		
		System.out.println("Please enter the price:");
		double price2 = kb.nextDouble();
		
		System.out.println("Please enter item 3:");
		kb.nextLine();
		String food3 = kb.nextLine();
		
		System.out.println("Please enter the price:");
		double price3 = kb.nextDouble();
		
		System.out.println("<<<<<<<<<<<<<<<___Receipt___>>>>>>>>>>>>>>>");
		form.format(food1, price1);
		form.format(food2, price2);
		form.format(food3, price3);
	
		
	}
	
	
	public void format(String food, double price)
	{
		System.out.printf("\n*   %18s  ........       %4.2f", food, price);
	}
	
	
	
}