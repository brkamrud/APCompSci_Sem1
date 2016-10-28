import java.util.Scanner;
import java.text.DecimalFormat;

public class CompoundInterest
{
	public static void main(String[]args)
	{
		CompoundInterest calculate = new CompoundInterest();
		Scanner kb = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat(".00");
		System.out.println("Enter your interest rate: (r)");
		double rate1 = kb.nextDouble();
		
		System.out.println("Enter the amount you intend to borrow: (p)");
		double principal1 = kb.nextDouble();
		
		System.out.println("Enter the number of times your loan will be compounded a year: (n)");
		double compound1 = kb.nextInt();
		
		System.out.println("Enter the life of the loan: (t)");
		double years1 = kb.nextInt();
		
		
		double total = calculate.loan(rate1, principal1, compound1, years1);
		//df.format(total);
		
		System.out.println("Your total monthly payment is $" + df.format(total) + ".");
		
	}
	
	public double loan(double r, double p, double n, double t)
	{
		
		// double num1 = (r / n) + 1;
		// double expo = n * t;
		// double total1 = Math.pow(num1, expo);
		// double total2 = (P * total1) / t;
		double total2 = (p * Math.pow((1 + (r / n)), (n * t))) / (t * 12);
		return total2;
	}
	
}