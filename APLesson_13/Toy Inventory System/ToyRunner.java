public class ToyRunner
{
	public static void main(String[]args)
	{
		AFigure af = new AFigure("action fig");
		Car car = new Car("car");
		
		System.out.println(af.toString());
		System.out.println(car.toString());
	}
	
}