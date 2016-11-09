import java.util.Scanner;

public class Underscores
{
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter a sentence:");
		String sentence = kb.nextLine();
		
		System.out.println(replace(sentence));
	}
	
	public static String replace(String sentence)
	{
		if (!sentence.contains(" "))
			return sentence;
		else
			return sentence.replaceAll(" ", "_");
		
	}
}