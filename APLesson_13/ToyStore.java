import java.util.ArrayList;

public class ToyStore
{
	private ArrayList<Toy> toyList = new ArrayList<Toy>();
	
	//DC
	public ToyStore()
	{
		toyList = "";
	}
	
	//C w/ P
	public ToyStore(ArrayList<Toy> toys)
	{
		toyList = toys;
	}
}