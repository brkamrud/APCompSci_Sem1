import java.util.Scanner;

public class DigitAdder
{
	static int number;
	
	public static void main (String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter a number:");
		number = kb.nextInt();
		int sum = 0;
		int num = number;
		sumDigits(num, sum);
		
	}
	
	public static void sumDigits(int num, int sum)
	{
		while (num > 0)
		{
			sum += num % 10;
			num /= 10;
		}
		System.out.println("The sum of the digits in " + number + " is " + sum);
	}
}