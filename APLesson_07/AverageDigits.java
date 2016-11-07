import java.util.Scanner;

public class AverageDigits
{
	static int number;
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter a number:");
		number = kb.nextInt();
		int digits = 0;
		int average = 0;
		
		avDigits(digits, average);
		
	}
	public static void avDigits(int digits, int average)
	{
		int num = number;
		while(num > 0)
		{
			digits += 1;
			average += num % 10;
			num /= 10;
		}
		average = average / digits;
		System.out.println("The average of the digits in " + number + " is " + average);
	}
}