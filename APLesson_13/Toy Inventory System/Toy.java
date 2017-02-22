public abstract class Toy
{
	private String name;
	private int count;
	
	//DC
	public Toy()
	{
		this.name = "";
		this.count = 1;
	}
	
	//C w/ P
	public Toy(String n)
	{
		this.name = n;
		this.count = 1;
	}
	
	//Accessors
	public String getName()
	{
		return name;
	}
	
	public int getCount()
	{
		return count;
	}
	
	//Modifiers
	public void setName(String n)
	{
		this.name = n;
	}
	
	public void setCount(int c)
	{
		this.count = c;
	}
	
	//Abstract Method
	public abstract String getType();
	
	//ToString
	public String toString()
	{
		return name + " - " + count;
	}
}