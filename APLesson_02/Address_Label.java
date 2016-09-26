import java.util.Scanner;

public class Address_Label
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("What is your name?");
		String name = kb.nextLine();
		
		System.out.println("What is your address?");
		String address = kb.nextLine();
		
		System.out.println("What state do you live in? (abbreviation)");
		String state = kb.next();
		kb.nextLine();
		
		System.out.println("What city?");
		String city = kb.nextLine();
		
		System.out.println("What is your ZIP code?");
		int zip = kb.nextInt();
		
		System.out.println("----------------------------------");
		System.out.println("|                                |");
		System.out.println("|       " + name + "             |");
		System.out.println("|       " + address + "          |");
		System.out.println("|       " + city + ", " + state + " " + zip + "      |");
		System.out.println("|                                |");
		System.out.println("----------------------------------");
		
		
		
	}
}