import java.util.Random;

public class Exercise_01
{
	public static void main(String[]args)
	{
		Random rand = new Random();
		
		int player = rand.nextInt(6)+1;
		int computer = rand.nextInt(6)+1;
		
		System.out.println("You rolled a " + player);
		System.out.println("The computer rolled a " + computer);
		rollDice(player, computer);
		
	}
	
	public static void rollDice(int p, int c)
	{
		if(p > c)
		{
			System.out.println("You win!");
			
		}
		
		if(p < c)
		{
			System.out.println("You lost!");
			
		}
		
		if(p == c)
		{
			System.out.println("It's a tie!");
			
		}
		
		
	}
	
}