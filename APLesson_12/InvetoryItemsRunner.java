import java.util.Scanner;

public class InvetoryItemsRunner
{
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter the manufacturer of the item:");
		String manufacturer = kb.nextLine();
		
		System.out.println("Enter the name of the item:");
		String name = kb.next();
		
		System.out.println("Do you want to enter the category and price? (y or n)");
		String YorN = kb.next();
		if (YorN.equals("y"))
		{
			System.out.println("Enter the category of the item:");
			String category = kb.next();
			
			System.out.println("Enter the price of the item:");
			String price = kb.next();
			
			InvetoryItems object1 = new InvetoryItems(manufacturer, name, category, price);
			System.out.println(object1);
		}
		else if (YorN.equals("n"))
		{
			InvetoryItems object2 = new InvetoryItems(manufacturer, name);
			System.out.println(object2);
		}
		
	}
}