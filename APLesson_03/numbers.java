import java.util.Scanner; //import statement

public class numbers
{
	public static void main(String[]args)
	{
		//instantiates the new Scanner object "keyboard"
		Scanner keyboard = new Scanner(System.in);
		
		//prompts user for user input
		System.out.println("Please enter a number ");
		
		//search for the next integer that the user enters
		int num = keyboard.nextInt();
		System.out.println("You entered the number " + num);
		
	}
}