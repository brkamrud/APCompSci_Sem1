import java.util.Scanner;

public class TheUserClassRunner
{
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter your First Name:");
		String fName = kb.next();
		
		System.out.println("Enter your Last Name:");
		String lName = kb.next();
		
		System.out.println("Do you want an avatar? (y or n)");
		String YorN = kb.next();
		if (YorN.equals("y"))
		{ 
			System.out.println("Enter an Avatar:");
			String avatar = kb.next();
			TheUserClass user1 = new TheUserClass(fName, lName, avatar);
			System.out.println(user1);
		}
		else if (YorN.equals("n"))
		{
			TheUserClass user2 = new TheUserClass(fName, lName);
			System.out.println(user2);
		}
	}
}