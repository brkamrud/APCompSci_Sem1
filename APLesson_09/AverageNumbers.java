
public class AverageNumbers
{
	static int[] numbers = new int[10];
	
	public static void main(String[]args)
	{
		for (int i = 0; i < numbers.length; i++)
		{
			numbers[i] = (int)(Math.random() * 100) + 1;
		}
		
		System.out.println("Numbers...");
		for (int number : numbers)
		{
			System.out.println(number);
		}
		
		average();
		
	}
	
	public static void average()
	{
		int avg = 0;
		for (int number : numbers)
		{
			avg += number;
		}
		avg /= numbers.length;
		System.out.println("The average of the above numbers is " + avg);
	}
}