public class AFigure extends Toy
{	
	//DC
	public AFigure()
	{
		super();
	}
	
	//C w/ P
	public AFigure(String name)
	{
		super(name);
	}
	
	//Accessors
	public String getName()
	{
		return super.getName();
	}
	
	public int getCount()
	{
		return super.getCount();
	}
	
	//Modifiers
	public void setName(String n)
	{
		super.setName(n);
	}
	
	public void setCount(int c)
	{
		super.setCount(c);
	}
	
	//Abstract Method
	public String getType()
	{
		return "Action Figure";
	}
	
	//ToString
	public String toString()
	{
		return super.toString();
	}
}