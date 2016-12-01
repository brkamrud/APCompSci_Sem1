import java.util.Scanner;

public class FirstLetter
{
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		String[] words = new String[5];
		
		System.out.println("Enter 5 words:");
		for (int i = 0; i < words.length; i++)
		{
			words[i] = kb.next();
		}
		
		first(words);
		
	}
	
	public static void first(String[] words)
	{
		int i = 0;
		for (String word : words)
		{
			System.out.println(words[i].charAt(0));
			 i += 1;
		}
		
	}
}