import java.util.Scanner;

public class Ex_03
{
	public static void main(String[]args)
	{
		Ex_03 calculate = new Ex_03();
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter your interest rate:");
		double rate1 = kb.nextDouble();
		
		System.out.println("Enter the amount you intend to borrow:");
		double principal1 = kb.nextDouble();
		
		System.out.println("Enter the number of times your loan will be compounded a year:");
		double compound1 = kb.nextInt();
		
		System.out.println("Enter the life of the loan:");
		double years1 = kb.nextInt();
		
		
		double total = calculate.loan(rate1, principal1, compound1, years1);
		
		System.out.println("Your total monthly payment is $" + total + ".");
		
	}
	
	public double loan(double r, double P, double n, double t)
	{
		
		double num1 = (r / n) + 1;
		double expo = n * t;
		double total1 = Math.pow(num1, expo);
		double total2 = P * total1;
		return total2;
	}
	
}