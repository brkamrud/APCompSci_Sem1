import java.util.Scanner;

public class ReplaceAts
{
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter a sentence:");
		String sentence =  kb.nextLine();
		
		replace(sentence);
	}
	public static void replace(String sentence)
	{
		while (sentence.contains("a"))
		{
			sentence = sentence.replaceAll("a", "@");
		}
		System.out.println(sentence);
	}
}