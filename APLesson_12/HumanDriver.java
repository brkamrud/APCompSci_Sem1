import java.util.Scanner;

public class HumanDriver
{
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter your hair color:");
		String hair = kb.next();
		
		System.out.println("Enter your eye color:");
		String eyes = kb.next();
		
		System.out.println("Enter your skin color:");
		String skin = kb.next();
		
		Human object = new Human(hair, eyes, skin);
		
		System.out.println("Your info...\nHair:\t" + object.getHair() + "\nEyes:\t" + object.getEyes() + "\nSkin:\t" + object.getSkin() + "\nNow enter your friend's hair color:");
		hair = kb.next();
		
		System.out.println("Enter their eye color:");
		eyes = kb.next();
		
		System.out.println("Enter their skin color:");
		skin = kb.next();
		
		object.setHES(hair, eyes, skin);
		
		System.out.println("Friend's info...\nHair:\t" + object.getHair() + "\nEyes:\t" + object.getEyes() + "\nSkin:\t" + object.getSkin());
	}
}