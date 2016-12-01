import java.util.Arrays;
import java.util.ArrayList;

public class KeepComposites
{
	
	public static void main(String[]args)
	{
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.addAll(Arrays.asList(2,6,8,9,10,12,13,15,17,24,55,66,78,77,79));
		
		removePrimes(numbers);
		System.out.println(numbers);
		
	}
	
	public static int gFactor(int n)
	{
		for (int i = 2; i < n; i++)
		{
			if (n % i == 0)
				return 1;
		}
		return 0;
	}
	
	public static void removePrimes(ArrayList<Integer> numbers)
	{
		for (int i = 0; i < numbers.size(); i++)
		{
			if (gFactor(numbers.get(i)) == 0)
			{
				numbers.remove(i);
				i -= 1;
			}
		}
	}
}