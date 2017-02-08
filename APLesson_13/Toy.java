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
	public Toy(String name)
	{
		this.name = name;
		this.count = 1;
	}
	
	//Accessors
	public String getName()
	{
		return this.name;
	}
	
	public int getCount()
	{
		return this.count;
	}
	
	//Modifiers
	public void setName()
	{
		
	}
	
	public void setCount()
	{
		
	}
	
	//Abstract Method
	public abstract void getType();
	
	//ToString
	public String toString()
	{
		return "[" + this.name + "] [" + this.count + "]";
	}
}