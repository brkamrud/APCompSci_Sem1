public class Human
{
	private String hair, eyes, skin;
	
	public Human() //Default Constructor
	{
		hair = "";
		eyes = "";
		skin = "";		
	}
	
	public Human(String h, String e, String s) //Constructor w/ Params
	{
		hair = h;
		eyes = e;
		skin = s;
	}
	
	public void setHES(String h, String e, String s) //Modifier
	{
		hair = h;
		eyes = e;
		skin = s;
	}
	
	//Accessors
	public String getHair()
	{
		return hair;
	}
	
	public String getEyes()
	{
		return eyes;
	}
	
	public String getSkin()
	{
		return skin;
	}
}