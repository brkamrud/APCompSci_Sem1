import java.util.Scanner;

public class CarDriver
{
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter your desired paint job:");
		String paint = kb.nextLine();
		
		System.out.println("Enter your desired interior:");
		String interior = kb.nextLine();
		
		System.out.println("Enter your desired engine:");
		String engine = kb.nextLine();
		
		System.out.println("Enter your desired tires:");
		String tires = kb.nextLine();
		
		Car object = new Car(paint, engine, interior, tires);
		
		System.out.println("Your vehicle is readu......");
		System.out.println("Paint:\t" + object.getPaint() + "\nInterior:\t" + object.getInterior() + "\nEngine:\t" + object.getEngine() + "\nTires:\t" + object.getTires());
	}
}