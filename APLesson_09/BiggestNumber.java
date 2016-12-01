public class BiggestNumber
{
	
	public static void main(String[]args)
	{
		int[] numbers = new int[10];
		printArray(fillArray(numbers));
		
	}
	
	public static int[] fillArray(int[] numbers)
	{
		int x = 0;
		for (int i : numbers)
		{
			numbers[x] = (int)(Math.random() * 100) + 1;
			x += 1;
		}
		return numbers;
	}
	
	public static int getBiggest(int[] numbers)
	{
		int max = numbers[0];
		for (int i : numbers)
		{
			if (i >= max)
				max = i;
		}
		return max;
	}
	
	public static void printArray(int[] numbers)
	{
		System.out.println("For the following numbers:");
		for (int i : numbers)
		{
			System.out.print(i + " ");
		}
		System.out.println("\n" + getBiggest(numbers) + " is the biggest.");
		
	}
}