import java.util.Scanner;

public class ID_Card
{
	public static void main(String[]args)
	{
		ID_Card form = new ID_Card();
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter your first name:");
		String fname = kb.nextLine();
		
		System.out.println("Enter your last name:");
		//kb.nextLine();
		String lname = kb.nextLine();
		
		System.out.println("Enter your title:");
		//kb.nextLine();
		String title = kb.nextLine();
		
		System.out.println("Enter your school site:");
		//kb.nextLine();
		String school = kb.nextLine();
		
		System.out.println("Enter your school year:");
		//kb.nextLine();
		String year = kb.nextLine();
		
		System.out.println("What is your subject?");
		//kb.nextLine();
		String subject = kb.nextLine();
		
		System.out.println("*****************************************************");
		form.format(school, year);
		form.format(lname, fname);
		form.format(title, subject);
		System.out.println("\n\n*****************************************************");
		
	}
	
	public void format(String text1, String text2)
	{
		System.out.printf("\n*  %18s			%18s  *", text1, text2);
	}
	
}