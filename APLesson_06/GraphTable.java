import java.util.Scanner;

public class GraphTable
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int num = kb.nextInt();
		System.out.println("Enter the size of the table:");
		int table = kb.nextInt();
		
		for (int i = 1; i <= table; i++)
		{
			System.out.println(i + " " + i * num);
			
		}
		
	}
	
}