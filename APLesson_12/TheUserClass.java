public class TheUserClass
{
	private String firstName, lastName, avatar;
	private int userID;
	
	public TheUserClass() //Default Constructor
	{
		firstName = "";
		lastName = "";
		avatar = "";
		userID = 0;
	}
	
	public TheUserClass(String fn, String ln) //Constructor 1
	{
		firstName = fn;
		lastName = ln;
		avatar = "UNDEFINED";
		userID = (int)(Math.random() * 1000000) + 1;
	}
	
	public TheUserClass(String fn, String ln, String av) //Constructor 2
	{
		firstName = fn;
		lastName = ln;
		avatar = av;
		userID = (int)(Math.random() * 1000000) + 1;
	}
	
	public void setAvatar(String av) //Modifier
	{
		avatar = av;
	}
	
	public String toString() //toString
	{
		return "Customer Info... \nFirst Name: " + firstName + "\nLast Name: " + lastName + "\nAvatar: " + avatar + "\nUser ID#: " + userID;
	}
	
	//Accessors
	public String getFName()
	{
		return firstName;
	}
	
	public String getLName()
	{
		return lastName;
	}
	
	public String getAvatar()
	{
		return avatar;
	}
	
	public int getUserID()
	{
		return userID;
	}
}