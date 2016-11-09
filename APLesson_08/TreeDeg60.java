import java.util.Scanner;

public class TreeDeg60
{
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter a word:");
		String word = kb.next();
		int stop = word.length();
		int start = 0;
		
		System.out.printf("%20s", tree(word, start, stop));
	}
	
	public static String tree(String word, int start, int stop)
	{
		if (start <= stop)
		{
			System.out.println(word.substring(0 , start));
			start += 1;
			return tree(word, start, stop);
		}
		else
			return word;
	}
}