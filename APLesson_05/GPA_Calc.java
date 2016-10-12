import java.util.Scanner;
import java.text.DecimalFormat;

public class GPA_Calc
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat(".##");
		
		System.out.println("Please enter your letter grade for math:");
		String math = kb.next();
		System.out.println("Please enter your letter grade for english:");
		String english = kb.next();
		System.out.println("Please enter your letter grade for science:");
		String science = kb.next();
		System.out.println("Please enter your letter grade for history:");
		String history = kb.next();
		System.out.println("Please enter your letter grade for art:");
		String art = kb.next();
		System.out.println("Please enter your letter grade for music:");
		String music = kb.next();
		System.out.println("Please enter your letter grade for PE:");
		String pe = kb.next();
		
		double GPA = (calcPoints(math) + calcPoints(english) + calcPoints(science) + calcPoints(history) + calcPoints(art) + calcPoints(music) + calcPoints(pe)) / 7;
		
		System.out.println("Your GPA is " + df.format(GPA));
		
	}
	
	public static double calcPoints(String x)
	{
		if (x.equals("a") || x.equals("A"))
			return 4.0;
		if (x.equals("b") || x.equals("B"))
			return 3.0;
		if (x.equals("c") || x.equals("C"))
			return 2.0;
		if (x.equals("d") || x.equals("D"))
			return 1.0;
		if (x.equals("f") || x.equals("F"))
			return 0.0;
		
		return 0.0;
	}
	
}