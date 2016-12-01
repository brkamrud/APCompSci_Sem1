
public class AverageNumbers
{
	
	public static void main(String[]args)
	{
		int[] numbers = new int[10];
		
		for (int i = 0; i < numbers.length; i++)
		{
			numbers[i] = (int)(Math.random() * 100) + 1;
		}
		
		System.out.println("Numbers...");
		for (int number : numbers)
		{
			System.out.println(number);
		}
		
		average(numbers);
		
	}
	
	public static void average(int[] numbers)
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