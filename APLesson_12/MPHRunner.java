import java.util.Scanner;

public class MPHRunner
{
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		int distance, hours, minutes;
		
		System.out.println("Enter distance:");
		distance = kb.nextInt();
		
		System.out.println("Enter hours:");
		hours = kb.nextInt();
		
		System.out.println("Enter minutes:");
		minutes = kb.nextInt();
		
		MilesPerHour object = new MilesPerHour(distance, hours, minutes);
		
		System.out.println(object.getDistance() + " miles in " + object.getHours() + " hours and " + object.getMinutes() + " minutes = " + object.getMPH() + " mph");
		
		
		System.out.println("Enter distance:"); //setting new distance, hours, and minutes
		distance = kb.nextInt();
		
		System.out.println("Enter hours:");
		hours = kb.nextInt();
		
		System.out.println("Enter minutes:");
		minutes = kb.nextInt();
		
		object.setValues(distance, hours, minutes);
		
		System.out.println(object.getDistance() + " miles in " + object.getHours() + " hours and " + object.getMinutes() + " minutes = " + object.getMPH() + " mph");
		
	}
}