public class Car
{
	private String paint, interior, engine, tires;
	
	public Car() //Default Constructor
	{
		paint = "";
		interior = "";
		engine = "";
		tires = "";
	}
	
	public Car(String p, String i, String e, String t) //Constructor w/ Params
	{
		paint = p;
		interior = i;
		engine = e;
		tires = t;
	}
	
	public void setCustom(String p, String i, String e, String t) //Modifier
	{
		paint = p;
		interior = i;
		engine = e;
		tires = t;
	}
	
	//Accessors
	public String getPaint()
	{
		return paint;
	}
	
	public String getInterior()
	{
		return interior;
	}
	
	public String getEngine()
	{
		return engine;
	}
	
	public String getTires()
	{
		return tires;
	}
}