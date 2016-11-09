import java.util.Scanner;

public class Center
{
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter a word:");
		String word1 = kb.next();
		
		System.out.println("Enter another word:");
		String word2 = kb.next();
		
		System.out.println("Enter one more word:");
		String word3 = kb.next();
		
		System.out.println(makeCenter(word1) + "\n" + makeCenter(word2) + "\n" + makeCenter(word3));
		
	}
	
	public static String makeCenter(String word)
	{
		if (word.length() >= 20)
			return word;
		else
			return makeCenter(" " + word + " ");
	}
}