public class Lab_02
{
	public static void main(String[]args)
	{
		int mult1 = 4;
		int mult2 = 2;
		int answer1 = mult1 * mult2;
		
		System.out.println("2 multiplied by 4 is " + answer1 + "\n" + "\n");
		
		String name = "Brett Kamrud";
		String address = "13396 Jarman Pl";
		String city = "San Diego";
		String zip = "92130";
		
		System.out.println("My name is " + name + "\n" + "I live in " + city + "\n" + "My address is " + address + "\n" + "My ZIP code is " + zip + "\n" + "\n");
		
		int w = 5;
		int l = 11;
		int h = 20;
		int A = 2*(w*l + h*l + h*w);
		
		System.out.println("The surface area of your rectangular prism is " + A);
	}
}