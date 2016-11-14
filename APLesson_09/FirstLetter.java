import java.util.Scanner;

public class FirstLetter
{
	static String[] words = new String[5];
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter 5 words:");
		for (int i = 0; i < words.length; i++)
		{
			words[i] = kb.next();
		}
		
		first();
		
	}
	
	public static void first()
	{
		int i = 0;
		for (String word : words)
		{
			System.out.println(words[i].charAt(0));
			 i += 1;
		}
		
	}
}