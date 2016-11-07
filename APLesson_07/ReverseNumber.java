import java.util.Scanner;
public class ReverseNumber
{
	static int num;
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int number = kb.nextInt();
		num = number;
		int rev = 0;
		
		getReverse(rev, number);
		
	}
	public static void getReverse(int rev, int number)
	{
		while (num > 0)
		{
			rev *= 10;
			rev += num % 10;
			num /= 10;
		}
		System.out.println(number + " reversed is " + rev);
	}
	
}