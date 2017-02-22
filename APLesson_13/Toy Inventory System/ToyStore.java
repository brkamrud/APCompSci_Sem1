import java.util.ArrayList;
import java.util.Arrays;

public class ToyStore
{
	private ArrayList<Toy> toyList;
	
	//DC
	public ToyStore()
	{
		this.toyList = new ArrayList<>();
	}
	
	//C w/ P
	public ToyStore(String toys)
	{
		loadToys(toys);
	}
	
	public void loadToys(String ts)
	{
		toyList = new ArrayList<>();
		ArrayList<String> toys = new ArrayList<String>(Arrays.asList(ts.split(", ")));
		
		for (int i = 0; i < toys.size(); i+=2)
		{
			String name = toys.get(i);
			String type = toys.get(i + 1);
			Toy t = getThatToy(name);
			if (t == null) //if the toy is not on the list
			{
				if (type.equals("Car"))
					toyList.add(new Car(name)); //add it to the list
				if (type.equals("AF"))
					toyList.add (new AFigure(name));
			}
			else //if the toy is on the list
				t.setCount(t.getCount() +1);
				
		}
	}
	
	//checks to see if a toy is on the list - looks by name
	public Toy getThatToy(String nm)
	{
		for (Toy t : toyList)
		{
			if (t.getName().equals(nm))
				return t;
		}
		return null;
	}
	
	public String getMostFrequentToy()
	{
		String name = "";
		int max = Integer.MIN_VALUE;
		for (Toy t : toyList)
		{
			if (max < t.getCount())
			{
				max = t.getCount();
				name = t.getName();
			}
		}
		return name;
	}
	
	public String getMostFrequentType()
	{
		int cars = 0;
		int figures = 0;
		for (Toy t : toyList)
		{
			if (t.getType().equals("Car"))
				cars += 1;
			if (t.getType().equals("Action Figure"))
				figures += 1;
		}
		if (cars > figures)
			return "Cars";
		if (cars < figures)
			return "Action Figures";
		
		return "Equal amounts of action figures and cars!";
	}
	
	public String toString()
	{
		return toyList.toString();
	}
}