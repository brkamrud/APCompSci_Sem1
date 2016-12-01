import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class ExpressionSolver
{
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter and equation:");
		String expression = kb.nextLine();
		ArrayList<String> equation = new ArrayList<>(Arrays.asList(expression.split(" ")));
		
		doEquation(equation);
	}
	
	public static void doEquation(ArrayList<String> equation)
	{
		int i = 0;
		while (i < equation.size())
		{
			if (equation.get(i).equals("*") || equation.get(i).equals("/"))
			{
				if (equation.get(i).equals("*"))
					equation.set(i, "" + (Integer.parseInt(equation.get(i - 1)) * Integer.parseInt(equation.get(i + 1))));
				else
					equation.set(i, "" + (Integer.parseInt(equation.get(i - 1)) / Integer.parseInt(equation.get(i + 1))));
				equation.remove(i - 1);
				equation.remove(i);
			}
			i += 1;
		}
		
		i = 0;
		
		while (i < equation.size())
		{
			if (equation.get(i).equals("+") || equation.get(i).equals("-"))
			{
				if (equation.get(i).equals("+"))
					equation.set(i, "" + (Integer.parseInt(equation.get(i - 1)) + Integer.parseInt(equation.get(i + 1))));
				else
					equation.set(i, "" + (Integer.parseInt(equation.get(i - 1)) - Integer.parseInt(equation.get(i + 1))));
				equation.remove(i - 1);
				equation.remove(i);
			}
			i += 1;
		}
		
		System.out.println(equation);
	}
}