import java.util.Scanner;

public class CountByX
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter what you want to count up to:");
		int limit = kb.nextInt();
		System.out.println("Enter what you want to count up by:");
		int count = kb.nextInt();
		
		for (int i = 0; i <= limit; i += count)
		{
			System.out.print(i + "\t");
		}
		
	}
	
}