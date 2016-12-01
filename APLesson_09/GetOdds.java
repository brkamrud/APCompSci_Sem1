public class GetOdds
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
			numbers[x] = (int)((Math.random() * 100)) + 1;
			x += 1;
		}
		return numbers;
	}
	
	public static int getOdds(int[] numbers)
	{
		int odds = 0;
		for (int i : numbers)
		{
			if (i % 2 == 1)
				odds += 1;
		}
		return odds;
		
	}
	
	public static void printArray(int[] numbers)
	{
		System.out.println("For the following numbers: ");
		for (int i : numbers)
		{
			System.out.print(i + " ");
		}
		System.out.println("\n" + getOdds(numbers) + " are odd.");
	}
}