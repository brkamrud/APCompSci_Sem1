import java.util.Scanner;

public class RudeAI
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner (System.in);
		
		
		System.out.println("Hi, my name is RudeAi." + "\n" + "I'd like to ask you a few questions." + "\n" + "What is your name?");
		String name = keyboard.next();
		
		System.out.println(name + "?!!! Why would anyone name a baby that?" + "\n" + "How old are you, " + name + "?");
		int age = keyboard.nextInt();
		
		System.out.println("Ooooo!!! " + age + " is getting up there." + "\n" + "What do you do for fun, " + name + "?");
		String fun = keyboard.next();
		
		System.out.println("I thought only nerds like to " + fun + "\n" + "What kind of music do you like?");
		String music = keyboard.next();
		
		System.out.println("Booooo!! I wouldn't wish the sound of " + music + " on my worst enemy!" + "\n" + "How many siblings do you have?");
		int siblings = keyboard.nextInt();
		
		System.out.println(siblings + "? Wow, I hope the rest of your family is better looking." + "\n" + "What do you want to be when you grow up?");
		String job = keyboard.next();
		
		System.out.println("I think you'd have to be smarter to be a " + job + "." + "\n" + "So " + name + ", you're " + age + "..." + "\n" + "You like to " + fun + " and listen to " + music + "..." + "\n" + "Good luck becoming a " + job + "." + "\n" + "I'm only kiddin' " + name + "!");
		
	}
}