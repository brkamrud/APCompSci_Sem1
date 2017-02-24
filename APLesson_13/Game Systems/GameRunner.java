public class GameRunner
{
	public static void main(String[]args)
	{
		Console xbox = new XBox();
		System.out.println(xbox.toString());
		
		Console pStation = new PlayStation();
		System.out.println("\n" + pStation.toString());
		
		GameSystem pc = new PC();
		System.out.println("\n" + pc.toString());
	}
}