import java.util.Scanner;

public class Password
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter your username:");
		String user = kb.nextLine();
		System.out.println("Please enter your password:");
		String pass = kb.nextLine();
		
		passCheck(user, pass);
		
	}
	
	public static void passCheck(String user, String pass)
	{
		if (user.equals("kamrudb9567") && pass.equals("brett123"))
			System.out.println("You are granted access!");
		else
			if (!user.equals("kamrudb9567") && pass.equals("brett123"))
				System.out.println("Your username is incorrect!");
		else
			if (user.equals("kamrudb9567") && !pass.equals("brett123"))
				System.out.println("Your password is incorrect!");
		else
			if (!user.equals("kamrudb9567") && !pass.equals("brett123"))
				System.out.println("Your username and password is incorrect!");
	}
}