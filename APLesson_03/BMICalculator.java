import java.util.Scanner;

public class BMICalculator
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Hello! I am BMICalculator." + "\n" + "If you'd please give me your Height and Weight, I can calculate your BMI for you." + "\n" + "So, what is your Height? (In inches please)");
		int height = keyboard.nextInt();
		
		System.out.println("And what is your Weight? (In lbs please)");
		double weight = keyboard.nextDouble();
		
		//calculates BMI
		double kg = weight * .45;
		double cm = (height * .025) * (height * .025);
		double bmi = kg / cm;
		
		
		System.out.println("Thank you! Please give me a second to calculate your BMI...");
		System.out.println("...");
		System.out.println("...");
		System.out.println("...");
		System.out.println("Your BMI is " + bmi + "\n" + "Thank your for using BMICalculator!");
	}
}