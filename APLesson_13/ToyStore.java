import java.util.ArrayList;
import java.util.Arrays;

public class ToyStore
{
	private ArrayList<String> toyList = new ArrayList<String>();
	
	//DC
	public ToyStore()
	{
		this.toyList = new ArrayList<String>();
	}
	
	//C w/ P
	public ToyStore(String toys)
	{
		loadToys(toys);
	}
	
	public void loadToys(String ts)
	{
		String[] list = ts.split(", ");
		ArrayList<String> toys = new ArrayList<String>(Arrays.asList(list));
		
		for (int i = 0; i < toys.size(); i++)
		{
			String name = toys.get(i);
			String type = toys.get(i + 1);
			if (getThatToy(name) == null)
			{
				if (type.equals("Car"))
					toyList.add("Car");
				else if (type.equals("AF"))
					toyList.add("AFigure");
			}
			else
				i++;
		}
	}
	
	public String getThatToy(String nm)
	{
		for (String toy : toyList)
		{
			if (toy.equals(nm))
				return toy;
			else
				return null;
		}
	}
}