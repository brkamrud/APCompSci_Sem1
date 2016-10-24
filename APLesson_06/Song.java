//import java.util.Scanner;

public class Song
{
	public static void main(String[]args)
	{
		//Scanner kb = new Scanner(System.in);
		String line1 = "Na";
		int loop1 = 4;
		String line2 = "Hey";
		int loop2 = 3;
		String line3 = "Goodbye!";
		int loop3 = 1;
		
		song(line1, loop1);
		System.out.println("");
		song(line1, loop1);
		System.out.println("");
		song(line2, loop2);
		System.out.println("");
		song(line3, loop3);
		
	}
	
	public static void song(String line, int loop)
	{
		for (int i = 1; i <= loop; i++)
		{
			System.out.print(line + "\t");
		}
		
	}
	
}