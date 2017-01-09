import java.util.Scanner;

public class DistanceRunner
{
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		int x1, x2, y1, y2;
		
		System.out.println("Enter a value for x1:");
		x1 = kb.nextInt();
		
		System.out.println("Enter a value for y1:");
		y1 = kb.nextInt();
		
		System.out.println("Enter a value for x2:");
		x2 = kb.nextInt();
		
		System.out.println("Enter a value for y2:");
		y2 = kb.nextInt();
		
		Distance object = new Distance(x1, x2, y1, y2);
		
		System.out.println("distance = " + object.getDist());
		
		
		
		System.out.println("Enter a value for x1:"); //setting new coordinates
		x1 = kb.nextInt();
		
		System.out.println("Enter a value for y1:");
		y1 = kb.nextInt();
		
		System.out.println("Enter a value for x2:");
		x2 = kb.nextInt();
		
		System.out.println("Enter a value for y2:");
		y2 = kb.nextInt();
		
		object.setValues(x1, x2, y1, y2);
		
		System.out.println("distance = " + object.getDist());
		
	}
}