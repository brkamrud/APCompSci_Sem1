import java.util.Scanner;

public class Lesson_03
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Who is your favorite teacher?");
		
		String teacher = keyboard.next();
		
		System.out.println(teacher + "?" + "\n" + "You could've chosen a better teacher than that...");
	}
}