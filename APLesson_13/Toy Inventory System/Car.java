public class Car extends Toy
{
	//DC
	public Car()
	{
		super();
	}
	
	//C w/ P
	public Car(String name)
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
		return "Car";
	}

}