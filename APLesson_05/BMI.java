import java.util.Scanner;
import java.text.DecimalFormat;

public class BMI
{
	static DecimalFormat df = new DecimalFormat(".#");
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		
		System.out.println("Please enter your weight in lbs:");
		double weightLB = kb.nextDouble();
		System.out.println("Please enter your height in inches:");
		double heightIN = kb.nextDouble();
		
		double weightKG = weightLB * .45;
		double heightM = heightIN * .025;
		
		calcBMI(weightKG, heightM);
		
		
	}
	
	public static void calcBMI(double weight, double height)
	{
		double bmi = weight / (height * height);
		
		if (bmi < 18.5)
			System.out.println("Your BMI is: " + df.format(bmi) + "\nYou are Underweight");
		else if (bmi >= 18.5 && bmi <= 24.9)
			System.out.println("Your BMI is: " + df.format(bmi) + "\nYou are Normal");
		else if (bmi >= 25 && bmi <= 29.9)
			System.out.println("Your BMI is: " + df.format(bmi) + "\nYou are Overweight");
		else if (bmi >= 30 && bmi <= 34.9)
			System.out.println("Your BMI is: " + df.format(bmi) + "\nYou are Obese");
		else if (bmi >- 35 && bmi <= 39.9)
			System.out.println("Your BMI is: " + df.format(bmi) + "\nYou are Very Obese");
		else if (bmi >= 40)
			System.out.println("Your BMI is: " + df.format(bmi) + "\nYou are Morbidly Obese");
	}
	
}