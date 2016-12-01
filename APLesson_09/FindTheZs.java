import java.util.Scanner;

public class FindTheZs
{
	static Scanner kb = new Scanner(System.in);
	
	public static void main(String[]args)
	{
		String[] words = new String[5];
		printArray(fillArray(words));
		
	}
	
	public static String[] fillArray(String[] words)
	{
		int x = 0;
		System.out.println("Please enter 5 words");
		for (String i : words)
		{
			words[x] = kb.next();
			x += 1;
		}
		return words;
		
	}
	
	public static String hasZs (String[] words)
	{
		String zs = "";
		for (String i : words)
		{
			if (i.contains("z") || i.contains("Z"))
				zs += i + " ";
		}
		return zs;
		
	}
	
	public static void printArray(String[] words)
	{
		System.out.println("For the words:");
		for (String i : words)
			System.out.print(i + " ");
		System.out.println("\n[" + hasZs(words) + "] contain(s) the letter z." );
		
	}
}